#include <WiFi.h>
#include <FirebaseESP32.h>
#include <ArduinoJson.h>
#include "ACS712.h"

// Wifi credentials
#define WIFI_SSID "Mustafa"
#define WIFI_PASSWORD "11111111"

// RealTime database credentials 
#define FIREBASE_HOST "lastone-6bf87-default-rtdb.firebaseio.com/"
#define FIREBASE_AUTH "4q01cyg4zCYvNNBkM87bTTtAHmdcoKJgIWW2AHFt"

// Define Firebase Data object
FirebaseData fbdo;

// Current Sensor Object Define
ACS712 sensor(ACS712_05B, 35);

// Define IR Sensors Pins in ESP 32
const int IR1 = 23;
const int IR2 = 12;
const int IR3 = 14; 
const int IR4 = 27;

// Firebase paths to Home controll variables
const char* ledPath = "/Home1";
const char* ledPath1 = "/Home2";

// Relay pins  - ESP 32
const int R1 = 5;
const int R2 = 4;
const int R3 = 2;
const int R4 = 18;

// Home Pins - ESP 32
const int R5 = 15;
const int R6 = 22;

// Adjust sensitivity for Current Sensor
const float sensitivity = 0.185;

void setup()
{
 // Declaring Led Pins As Output Voltage  
 pinMode(R1,OUTPUT);
 pinMode(R2,OUTPUT);
 pinMode(R3,OUTPUT);
 pinMode(R4,OUTPUT);
 pinMode(R5, OUTPUT);
 pinMode(R6, OUTPUT);
 
  // Declaring Sensor Pins As Input Voltage  
 pinMode(IR1,INPUT);
 pinMode(IR2,INPUT);
 pinMode(IR3,INPUT);
 pinMode(IR4,INPUT);
 
 // Initilaiz Home pins to be Off For first time 
 digitalWrite(R5, LOW);
 digitalWrite(R6, LOW);
 
 sensor.calibrate();
 Serial.begin(9600);

 // Connect to Wi-Fi
 WiFi.begin(WIFI_SSID, WIFI_PASSWORD);
 while (WiFi.status() != WL_CONNECTED)
{
 delay(500);
 Serial.print(".");
}
  Serial.println();
  Serial.print("Connected to WiFi. IP address: ");
  Serial.println(WiFi.localIP());

  // Initialize Firebase
  Firebase.begin(FIREBASE_HOST, FIREBASE_AUTH);
  digitalWrite(R1, LOW);
  
}

void loop()
{
  
  // Storing Sensors Values 
  int sensor1 = digitalRead(IR1);
  int sensor2 = digitalRead(IR2);
  int sensor3 = digitalRead(IR3);
  int sensor4 = digitalRead(IR4);
  float I = sensor.getCurrentAC();
  
  //ignoring the value below 0.09
  float voltage = (I / 1023.0) * 5000;  // 5V reference voltage
  
  // Convert voltage to current
  float current = (voltage - 2500) / sensitivity;
  
  // Print the current value
  Serial.print("Current: ");
  Serial.print(current);
  Serial.println(" mA");
  
  // Set the LED status value in firebase
  Firebase.setFloat(fbdo, "/CurrentMeasure", I );
  
  //Conditions in which to light homes or not.  
if (Firebase.getInt(fbdo, ledPath)) {
    // Get the LED status value
    int ledStatus = fbdo.intData();

    // Control the LED based on the received value.
    if (ledStatus == 0) {
      digitalWrite(R5, HIGH);
    } else {
      digitalWrite(R5, LOW);
    }
  }
  
  if (Firebase.getInt(fbdo, ledPath1)) {
    // Get the LED status value
    int ledStatus1 = fbdo.intData();

    // Control the LED based on the received value
    if (ledStatus1 == 0) {
      digitalWrite(R6, HIGH);
    } else {
      digitalWrite(R6, LOW);
    }
  }



//Conditions in which to light streat lights ON/OFF
  if (sensor1 == 0)
  {
    digitalWrite(R1, LOW);
    Firebase.setInt(fbdo, "/Led1", 1);
    Serial.println("sensor4");
  }
  else 
  {
    digitalWrite(R1,  HIGH);
    Firebase.setInt(fbdo, "/Led1", 0);
  }
  
  if (sensor2 == 0)
  {
    digitalWrite(R2, LOW);
    Firebase.setInt(fbdo, "/Led2", 1);
    Serial.println("sensor2");
  }
  else 
  {
    digitalWrite(R2, HIGH);
    Firebase.setInt(fbdo, "/Led2", 0);
  }
  
  if (sensor3 == 0)
  {
    digitalWrite(R3, LOW);
    Firebase.setInt(fbdo, "/Led3", 1);
    Serial.println("sensor3");
  }
  else 
  {
    digitalWrite(R3, HIGH);
    Firebase.setInt(fbdo, "/Led3", 0);
  }
    if (sensor4 == 0)
  {
    digitalWrite(R4, LOW);
    Firebase.setInt(fbdo, "/Led4", 1);
    Serial.println("sensor4");
  }
  else 
  {
    digitalWrite(R4, HIGH);
    Firebase.setInt(fbdo, "/Led4", 0);
  }
   
}