package com.example.onlight_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class OnOffActivity extends AppCompatActivity {
    private LottieAnimationView animationView_OnOff_one,animationView_OnOff_wait;
    private TextView text_description_feature_4;
    private Switch onANDOf_feature_switch_on;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_off);

        text_description_feature_4 = findViewById(R.id.OnOff_title_tv);
        onANDOf_feature_switch_on = (Switch)findViewById(R.id.OnOff_onAndOF_switch);
        animationView_OnOff_one = findViewById(R.id.animation_on_off_one_i);
        animationView_OnOff_wait = findViewById(R.id.animation_on_off_two_wait);

        onANDOf_feature_switch_on.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    text_description_feature_4.setVisibility(View.GONE);
                    animationView_OnOff_one.setVisibility(View.VISIBLE);
                    animationView_OnOff_wait.setVisibility(View.GONE);
                    onANDOf_feature_switch_on.setText("ON");
                }else{
                    //CHANGE
                    text_description_feature_4.setVisibility(View.VISIBLE);
                    animationView_OnOff_one.setVisibility(View.GONE);
                    animationView_OnOff_wait.setVisibility(View.VISIBLE);
                    onANDOf_feature_switch_on.setText("OFF");
                }
            }
        });

    }
}