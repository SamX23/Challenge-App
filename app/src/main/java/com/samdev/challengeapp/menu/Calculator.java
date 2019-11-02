package com.samdev.challengeapp.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.samdev.challengeapp.R;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        // Perkenalan res dengan fungsinya
        final EditText inp1 = findViewById(R.id.num1);
        final EditText inp2 = findViewById(R.id.num2);
        Button add = findViewById(R.id.bAdd);
        Button min = findViewById(R.id.bMin);
        Button mul = findViewById(R.id.bMul);
        Button div = findViewById(R.id.bDiv);
        Button clear = findViewById(R.id.bClear);
        final TextView res = findViewById(R.id.bRes);

        // Menambahkan fungsi tombol
        // Penjumlahan
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((inp1.getText().length() > 0) && (inp2.getText().length() > 0)) {
                    double input1 = Double.parseDouble(inp1.getText().toString());
                    double input2 = Double.parseDouble(inp2.getText().toString());
                    double result = input1 + input2;
                    //res.setText(Double.toString(result));
                    res.setText(String.valueOf(result));
                } else {
                    Toast toast = Toast.makeText(Calculator.this, "Masukan Number", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        // Pengurangan
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((inp1.getText().length() > 0) && (inp2.getText().length() > 0)) {
                    double input1 = Double.parseDouble(inp1.getText().toString());
                    double input2 = Double.parseDouble(inp2.getText().toString());
                    double result = input1 - input2;
                    //res.setText(Double.toString(result));
                    res.setText(String.valueOf(result));
                } else {
                    Toast toast = Toast.makeText(Calculator.this, "Masukan Number", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        // Perkalian
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((inp1.getText().length() > 0) && (inp2.getText().length() > 0)) {
                    double input1 = Double.parseDouble(inp1.getText().toString());
                    double input2 = Double.parseDouble(inp2.getText().toString());
                    double result = input1 * input2;
                    //res.setText(Double.toString(result));
                    res.setText(String.valueOf(result));
                } else {
                    Toast toast = Toast.makeText(Calculator.this, "Masukan Number", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        // Pembagian
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((inp1.getText().length() > 0) && (inp2.getText().length() > 0)) {
                    double input1 = Double.parseDouble(inp1.getText().toString());
                    double input2 = Double.parseDouble(inp2.getText().toString());
                    double result = input1 / input2;
                    //res.setText(Double.toString(result));
                    res.setText(String.valueOf(result));
                } else {
                    Toast toast = Toast.makeText(Calculator.this, "Masukan Number", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        // Clear
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp1.setText("");
                inp2.setText("");
                res.setText("0");
                inp1.requestFocus();
            }
        });


    }
}
