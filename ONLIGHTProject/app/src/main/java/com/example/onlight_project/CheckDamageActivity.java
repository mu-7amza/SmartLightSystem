package com.example.onlight_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class CheckDamageActivity extends AppCompatActivity {
    private TextView text_description_feature_2;
    private Button onANDOf_feature_btn_2;
    private LottieAnimationView animationView_check_damage_one,animationView_check_damage_wait;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_damage);

//        text_description_feature_2 = findViewById(R.id.CheckForDamage_title_tv);
//        onANDOf_feature_btn_2 = findViewById(R.id.CheckForDamage_onAndOF_switch);
//        animationView_check_damage_one = findViewById(R.id.animation_check_damage_one_i);
//        animationView_check_damage_wait = findViewById(R.id.animation_check_damage_two_wait);
//
//        onANDOf_feature_btn_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                animationView_check_damage_one.setVisibility(View.VISIBLE);
//                animationView_check_damage_wait.setVisibility(View.GONE);
//                text_description_feature_2.setText("Im Scanning Right now . .    ");
//            }
//        });






    }
}