package com.deifm.radio.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.deifm.radio.R;

public class SplashActivity extends AppCompatActivity {
    private int time = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent Main = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(Main);
                finish();

            }
        },time);
    }
}
