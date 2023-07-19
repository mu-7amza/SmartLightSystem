package com.example.onlight_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
    TextView titleChangeLanguage , dash_solar_energyChangeLanguage , onOFFChangeLanguage , monitoringChangeLanguage
            , check_damageChangeLanguage , synchronizationChangeLanguage , settingSynchronization;
    ImageView monitorDir , settingDir , solarDir , onOFFDir , damageDir , synchronizationDir;
    CardView monitor_card,sync_card;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        // animation in background
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        RelativeLayout relativeLayout = findViewById(R.id.dashboard_Activity);

        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
        // initialization variables . .
        titleChangeLanguage = findViewById(R.id.dashboard_Activity_title);
        dash_solar_energyChangeLanguage =findViewById(R.id.dash_solar_energy);
        onOFFChangeLanguage = findViewById(R.id.dash_on_off_2);
        monitoringChangeLanguage = findViewById(R.id.dash_monitor_3);
        check_damageChangeLanguage = findViewById(R.id.dash_damage_4);
        synchronizationChangeLanguage = findViewById(R.id.dash_Synchronization_5);
        settingSynchronization = findViewById(R.id.dash_setting_6);
        monitorDir = findViewById(R.id.dash_monitor_direction);
        settingDir = findViewById(R.id.setting_icon_animation);
        solarDir = findViewById(R.id.setting_solar_animation);
        onOFFDir = findViewById(R.id.setting_on_animation);
        damageDir = findViewById(R.id.setting_damage_animation);
        synchronizationDir = findViewById(R.id.setting_Synchronization_animation);
        monitor_card = findViewById(R.id.dash_card_monitor);

        synchronizationDir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(DashboardActivity.this, SynchronizationActivity.class);
                startActivity(myIntent);
            }
        });

        monitor_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(DashboardActivity.this, MonitorActivity.class);
                startActivity(myIntent);
            }
        });

        damageDir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(DashboardActivity.this, CheckDamageActivity.class);
                startActivity(myIntent);
            }
        });

        settingDir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(DashboardActivity.this, SettingsActivity.class);
                startActivity(myIntent);
            }
        });

        onOFFDir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(DashboardActivity.this, OnOffActivity.class);
                startActivity(myIntent);
            }
        });

        solarDir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(DashboardActivity.this, SolarEnergyActivity.class);
                startActivity(myIntent);
            }
        });

    }
}