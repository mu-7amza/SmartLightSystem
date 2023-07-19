package com.example.onlight_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class SynchronizationActivity extends AppCompatActivity {
    private TextView text_description_feature;
    private Switch onANDOf_feature_switch;
    private LottieAnimationView animationView_sync_one,animationView_sync_wait;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synchronization);
//
//        text_description_feature = findViewById(R.id.synchronization_title_tv);
//        onANDOf_feature_switch = (Switch)findViewById(R.id.synchronization_onAndOF_switch);
//        animationView_sync_one = findViewById(R.id.animation_synchronization_one_i);
//        animationView_sync_wait = findViewById(R.id.animation_synchronization_two_wait);

//
//        onANDOf_feature_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
//                if(isChecked){
//                    text_description_feature.setVisibility(View.GONE);
//                    animationView_sync_one.setVisibility(View.VISIBLE);
//                    animationView_sync_wait.setVisibility(View.GONE);
//                    onANDOf_feature_switch.setText("ON");
//                }else{
//                    //CHANGE
//                    text_description_feature.setVisibility(View.VISIBLE);
//                    animationView_sync_one.setVisibility(View.GONE);
//                    animationView_sync_wait.setVisibility(View.VISIBLE);
//                    onANDOf_feature_switch.setText("OFF");
//                }
//            }
//        });


    }
}