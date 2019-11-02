package com.samdev.challengeapp.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.samdev.challengeapp.R;

public class SettingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        String title = "Setting";
        setTitle(title);

        final Switch sw1 = findViewById(R.id.switch1);
        final Switch sw2 = findViewById(R.id.switch2);
        final Switch sw3 = findViewById(R.id.switch3);
        Button bt1 = findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String statusSw1, statusSw2, statusSw3;
                if (sw1.isChecked()) {
                    statusSw1 = sw1.getTextOn().toString();
                } else {
                    statusSw1 = sw1.getTextOff().toString();
                }

                if (sw2.isChecked()) {
                    statusSw2 = sw2.getTextOn().toString();
                } else {
                    statusSw2 = sw2.getTextOff().toString();

                }

                if (sw3.isChecked()) {
                    statusSw3 = sw3.getTextOn().toString();
                } else {
                    statusSw3 = sw3.getTextOff().toString();

                }

                Toast.makeText(getApplicationContext(),
                        "Switch1 :" + statusSw1 + "\n" +
                                "Switch2 :" + statusSw2 + "\n" +
                                "Switch3 :" + statusSw3 + "\n", Toast.LENGTH_LONG).show();
            }
        });
    }
}
