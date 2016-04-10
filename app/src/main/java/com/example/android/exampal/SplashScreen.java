package com.example.android.exampal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
    private static boolean playOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(!playOnce) {
            setContentView(R.layout.activity_splash_screen);
           Animation animFade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
            ImageView imageView=(ImageView) findViewById(R.id.Splashscreen);
            imageView.startAnimation(animFade);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent =new Intent(SplashScreen.this,LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            },7000);
                    playOnce = true;
        }
        else
        {
            Intent intent =new Intent(SplashScreen.this,LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
