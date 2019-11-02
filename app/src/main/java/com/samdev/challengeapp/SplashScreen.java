package com.samdev.challengeapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private void LogCheck(String txt) {
        String HOME_ACTIVITY_TAG = MainActivity.class.getSimpleName();
        Log.d(HOME_ACTIVITY_TAG, txt);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        LogCheck("onCreateSplash");

        int load = 2000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        }, load);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogCheck("onDestroySplash");
    }
}
