package com.samdev.challengeapp.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.samdev.challengeapp.R;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        final EditText name = findViewById(R.id.editText);
        final EditText password = findViewById(R.id.editText2);
        final EditText email = findViewById(R.id.editText3);
        final EditText wa = findViewById(R.id.editText4);
        final EditText country = findViewById(R.id.editText5);
        Button submit = findViewById(R.id.bSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().isEmpty() ||
                        password.getText().toString().isEmpty() ||
                        email.getText().toString().isEmpty() ||
                        wa.getText().toString().isEmpty() ||
                        country.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter the Data", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Name -  "
                            + name.getText().toString() + " \n" + "Password -  "
                            + password.getText().toString() + " \n" + "E-Mail -  "
                            + email.getText().toString() + " \n" + "WhatsApp -  "
                            + wa.getText().toString() + " \n" + "Country -  "
                            + country.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}