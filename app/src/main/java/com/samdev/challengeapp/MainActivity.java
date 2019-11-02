package com.samdev.challengeapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.samdev.challengeapp.menu.Calculator;
import com.samdev.challengeapp.menu.CountDown;
import com.samdev.challengeapp.menu.FormActivity;
import com.samdev.challengeapp.menu.InputNameButton;
import com.samdev.challengeapp.menu.SettingActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private void LogCheck(String txt) {
        String HOME_ACTIVITY_TAG = MainActivity.class.getSimpleName();
        Log.d(HOME_ACTIVITY_TAG, txt);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogCheck("onCreate");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Button assigned here
        buttonAssign();

    }

    public void buttonAssign() {
        Button button1 = findViewById(R.id.button01);
        button1.setOnClickListener(this);

        Button button2 = findViewById(R.id.button02);
        button2.setOnClickListener(this);

        Button button3 = findViewById(R.id.button03);
        button3.setOnClickListener(this);

        Button button4 = findViewById(R.id.button04);
        button4.setOnClickListener(this);

        Button button5 = findViewById(R.id.button05);
        button5.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Each activity in this menu is assigned in Manifest as a child of MainActivity
        int id = item.getItemId();

        if (id == R.id.login_act) {
            Intent login = new Intent(this, LoginActivity.class);
            startActivity(login);
            return true;
        }
        // Setting activity example
        if (id == R.id.action_settings) {
            Intent setting = new Intent(this, SettingActivity.class);
            startActivity(setting);
            return true;
        }

        // Form activity Example
        if (id == R.id.action_form) {
            Intent form = new Intent(this, FormActivity.class);
            startActivity(form);
            return true;
        }

        // Calculator activity Example
        if (id == R.id.action_calc) {
            Intent calc = new Intent(this, Calculator.class);
            startActivity(calc);
            return true;
        }

        // Countdown activity Example
        if (id == R.id.action_count_down) {
            Intent countdown = new Intent(this, CountDown.class);
            startActivity(countdown);
            return true;
        }

        // Text Input activity Example
        if (id == R.id.action_input) {
            Intent actInp = new Intent(this, InputNameButton.class);
            startActivity(actInp);
            return true;
        }

        if (id == R.id.close) {
            System.exit(1);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogCheck("onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogCheck("onDestroy");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button01:
            case R.id.button05:
            case R.id.button04:
            case R.id.button03:
            case R.id.button02:
                break;
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}