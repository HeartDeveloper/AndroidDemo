package com.example.zhang.animation_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Animation loadAnimation;
    private Button alphabtn;
    private Button scalebtn;
    private Button translatebtn;
    private Button rotatebtn;
    private Button bt1;
    private Button bt2;
    private Button activitybtn;
    private Button bt3;
    private Button bt4;
    private ImageView alphaimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alphabtn= (Button) findViewById(R.id.alpha_btn);
        scalebtn= (Button) findViewById(R.id.scale_btn);
        translatebtn= (Button) findViewById(R.id.translate_btn);
        rotatebtn= (Button) findViewById(R.id.rotate_btn);
        bt1= (Button) findViewById(R.id.bt1);
        bt2= (Button) findViewById(R.id.btn2);
        activitybtn= (Button) findViewById(R.id.activity_btn);
        bt3= (Button) findViewById(R.id.bt3);
        bt4= (Button) findViewById(R.id.btn4);
        alphaimg= (ImageView) findViewById(R.id.alpha_img);

        alphabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadAnimation=AnimationUtils .loadAnimation(MainActivity.this,R.anim.alpha);
                alphaimg.startAnimation(loadAnimation);
            }
        });

        scalebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadAnimation=AnimationUtils .loadAnimation(MainActivity.this,R.anim.scale);
                alphaimg.startAnimation(loadAnimation);
            }
        });

        translatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadAnimation=AnimationUtils .loadAnimation(MainActivity.this,R.anim.translate);
                alphaimg.startAnimation(loadAnimation);
            }
        });

        rotatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation a=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                a.setFillAfter(true);
                alphaimg.startAnimation(a);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation a1=AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
                alphaimg.startAnimation(a1);
               final Animation a2=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                a1.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }
                    @Override
                    public void onAnimationEnd(Animation animation) {
                        alphaimg.startAnimation(a2);
                    }
                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadAnimation=AnimationUtils .loadAnimation(MainActivity.this,R.anim.lianxu);
                loadAnimation.setFillAfter(true);
                alphaimg.startAnimation(loadAnimation);
            }
        });

        activitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Out2Activity.class);
                startActivity(intent);
                //第一参：第二个ac进入动画
                overridePendingTransition(R.anim.activity_out,R.anim.activity_in);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlphaAnimation alphaAnimation=new AlphaAnimation(0.1f,1.0f);
                alphaAnimation.setDuration(100);
                alphaAnimation.setRepeatCount(1);
                //REVERSE倒叙重复 restart正序
                alphaAnimation.setRepeatMode(Animation.REVERSE);
                alphaimg.startAnimation(alphaAnimation);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);
            }
        });
    }
}
