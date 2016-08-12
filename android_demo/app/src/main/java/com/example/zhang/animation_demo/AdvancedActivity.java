package com.example.zhang.animation_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class AdvancedActivity extends AppCompatActivity {
    private Button bt5;
    private Button bt6;
    private Button bt7;
    private Button bt8;
    private Button bt9;
    private Button bt10;
    private Button bt11;
    private Button bt12;
    private Button bt13;
    private Button bt14;
    private Button bt15;
    private Button bt16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        bt5= (Button) findViewById(R.id.btn5);
        bt6= (Button) findViewById(R.id.btn6);
        bt7= (Button) findViewById(R.id.btn7);
        bt8= (Button) findViewById(R.id.btn8);
        bt9= (Button) findViewById(R.id.btn9);
        bt10= (Button) findViewById(R.id.btn10);
        bt11= (Button) findViewById(R.id.btn11);
        bt12= (Button) findViewById(R.id.btn12);
        bt13= (Button) findViewById(R.id.btn13);
        bt14= (Button) findViewById(R.id.btn14);
        bt15= (Button) findViewById(R.id.btn15);
        bt16= (Button) findViewById(R.id.btn16);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.advanced_img));
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Flash)
                        .duration(500)
                        .playOn(findViewById(R.id.advanced_img));
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Pulse)
                        .duration(1000)
                        .playOn(findViewById(R.id.advanced_img));
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand)
                        .duration(1000)
                        .playOn(findViewById(R.id.advanced_img));
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Shake)
                        .duration(1000)
                        .playOn(findViewById(R.id.advanced_img));
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Swing)
                        .duration(1000)
                        .playOn(findViewById(R.id.advanced_img));
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Wobble)
                        .duration(1000)
                        .playOn(findViewById(R.id.advanced_img));
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Bounce)
                        .duration(1000)
                        .playOn(findViewById(R.id.advanced_img));
            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.StandUp)
                        .duration(1000)
                        .playOn(findViewById(R.id.advanced_img));
            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Wave)
                        .duration(1000)
                        .playOn(findViewById(R.id.advanced_img));
            }
        });
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Hinge)
                        .duration(1000)
                        .playOn(findViewById(R.id.advanced_img));
            }
        });
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RollIn)
                        .duration(1000)
                        .playOn(findViewById(R.id.advanced_img));
            }
        });
    }
}
