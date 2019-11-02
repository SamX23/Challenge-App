package com.samdev.challengeapp.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.samdev.challengeapp.R;

public class InputNameButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_name_button);
        final EditText Tname = findViewById(R.id.txtNama);
        final TextView Hasil = findViewById(R.id.textView);
        Button bres = findViewById(R.id.btnTampil);

        bres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hasil.setText("nama anda" + Tname.getText());
            }
        });
    }
}