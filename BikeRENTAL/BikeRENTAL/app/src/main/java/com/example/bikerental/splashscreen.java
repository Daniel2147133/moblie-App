package com.example.bikerental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;


public class splashscreen extends AppCompatActivity   {
    private Thread run;
    LottieAnimationView lottieAnimationView,lottieAnimationView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        lottieAnimationView=findViewById(R.id.animation_view);
        lottieAnimationView2=findViewById(R.id.animation_view2);

        lottieAnimationView.playAnimation();
        lottieAnimationView2.playAnimation();

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep (4000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent i = new
                            Intent(splashscreen.this,MainActivity.class);
                    startActivity(i);
                }
            }
        };thread.start();
    }
}