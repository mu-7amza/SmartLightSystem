package com.example.onlight_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class IDLoginActivity extends AppCompatActivity {
    RelativeLayout activityXML;
    Button goToControlBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idlogin);

        activityXML = findViewById(R.id.loginManagerXML);
        AnimationDrawable animationDrawable = (AnimationDrawable) activityXML.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        goToControlBtn = findViewById(R.id.loginManagerActivity_next_btn);
        goToControlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(IDLoginActivity.this, DashboardActivity.class);
                startActivity(myIntent);
            }
        });
    }
}