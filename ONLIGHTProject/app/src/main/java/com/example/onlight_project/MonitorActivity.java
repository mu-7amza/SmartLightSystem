package com.example.onlight_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MonitorActivity extends AppCompatActivity {
    ImageView lamp_group_one_1,lamp_group_one_2,lamp_group_one_3,lamp_group_one_4,
    lamp_group_one_5,lamp_group_one_6,lamp_group_one_7,lamp_group_one_8,lamp_group_two_1,
    lamp_group_two_2,lamp_group_two_3,lamp_group_two_4,lamp_group_two_5,lamp_group_two_6,lamp_group_two_7
    ,lamp_group_two_8,lamp_group_three_1,lamp_group_three_2,lamp_group_three_3,lamp_group_three_4,
     lamp_group_three_5,lamp_group_three_6,lamp_group_three_7,lamp_group_three_8,lamp_group_four_1,
     lamp_group_four_2,lamp_group_four_3,lamp_group_four_4,lamp_group_four_5,lamp_group_four_6,
     lamp_group_four_7,lamp_group_four_8;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);
        ScrollView myScrollView = findViewById(R.id.mainScroll);
        myScrollView.setVerticalScrollBarEnabled(false);
        myScrollView.setHorizontalScrollBarEnabled(false);


        // TODO : 4 Group with 4 sensor

        // Group one about 4*2 lamps ( 8 ) in one sensor .
        lamp_group_one_1 = findViewById(R.id.group_one_lamp_one);
        lamp_group_one_2 = findViewById(R.id.group_one_lamp_two);
        lamp_group_one_3 = findViewById(R.id.group_one_lamp_three);
        lamp_group_one_4 = findViewById(R.id.group_one_lamp_four);
        lamp_group_one_5 = findViewById(R.id.group_one_lamp_five);
        lamp_group_one_6 = findViewById(R.id.group_one_lamp_six);
        lamp_group_one_7 = findViewById(R.id.group_one_lamp_seven);
        lamp_group_one_8 = findViewById(R.id.group_one_lamp_eight);

        // Group two about 4*2 lamps ( 8 ) in one sensor .
        lamp_group_two_1 = findViewById(R.id.group_two_lamp_one);
        lamp_group_two_2 = findViewById(R.id.group_two_lamp_two);
        lamp_group_two_3 = findViewById(R.id.group_two_lamp_three);
        lamp_group_two_4 = findViewById(R.id.group_two_lamp_four);
        lamp_group_two_5 = findViewById(R.id.group_two_lamp_five);
        lamp_group_two_6 = findViewById(R.id.group_two_lamp_six);
        lamp_group_two_7 = findViewById(R.id.group_two_lamp_seven);
        lamp_group_two_8 = findViewById(R.id.group_two_lamp_eight);

        // Group three about 4*2 lamps ( 8 ) in one sensor .
        lamp_group_three_1 = findViewById(R.id.group_three_lamp_one);
        lamp_group_three_2 = findViewById(R.id.group_three_lamp_two);
        lamp_group_three_3 = findViewById(R.id.group_three_lamp_three);
        lamp_group_three_4 = findViewById(R.id.group_three_lamp_four);
        lamp_group_three_5 = findViewById(R.id.group_three_lamp_five);
        lamp_group_three_6 = findViewById(R.id.group_three_lamp_six);
        lamp_group_three_7 = findViewById(R.id.group_three_lamp_seven);
        lamp_group_three_8 = findViewById(R.id.group_three_lamp_eight);

        // Group four about 4*2 lamps ( 8 ) in one sensor .
        lamp_group_four_1 = findViewById(R.id.group_four_lamp_one);
        lamp_group_four_2 = findViewById(R.id.group_four_lamp_two);
        lamp_group_four_3 = findViewById(R.id.group_four_lamp_three);
        lamp_group_four_4 = findViewById(R.id.group_four_lamp_four);
        lamp_group_four_5 = findViewById(R.id.group_four_lamp_five);
        lamp_group_four_6 = findViewById(R.id.group_four_lamp_six);
        lamp_group_four_7 = findViewById(R.id.group_four_lamp_seven);
        lamp_group_four_8 = findViewById(R.id.group_four_lamp_eight);


    }
}