package com.example.ppbghari1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {
    private EditText Edit1, Edit2;
    private Button btnTambah, btnKurang, btnKali, btnBagi;
    private TextView tvHasil;
    String sAngka1, sAngka2;
    double dAngka1, dAngka2, dHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        //init var layout to java
        Edit1 = findViewById(R.id.Edit1);
        Edit2 = findViewById(R.id.Edit2);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        tvHasil = findViewById(R.id.tvHasil);

        //action button operation

        //btnTambah
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //angka pertama
                sAngka1 = Edit1.getText().toString();
                dAngka1 = Double.parseDouble(sAngka1);
                //angka kedua
                sAngka2 = Edit2.getText().toString();
                dAngka2 = Double.parseDouble(sAngka2);
                //hasil
                dHasil = dAngka1+dAngka2;
                tvHasil.setText("" +dHasil);
            }
        });
        //btnKurang
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //angka pertama
                sAngka1 = Edit1.getText().toString();
                dAngka1 = Double.parseDouble(sAngka1);
                //angka kedua
                sAngka2 = Edit2.getText().toString();
                dAngka2 = Double.parseDouble(sAngka2);
                //hasil
                dHasil = dAngka1-dAngka2;
                tvHasil.setText("" +dHasil);
            }
        });
        //btnKali
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //angka pertama
                sAngka1 = Edit1.getText().toString();
                dAngka1 = Double.parseDouble(sAngka1);
                //angka kedua
                sAngka2 = Edit2.getText().toString();
                dAngka2 = Double.parseDouble(sAngka2);
                //hasil
                dHasil = dAngka1*dAngka2;
                tvHasil.setText("" +dHasil);
            }
        });
        //btnBagi
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //angka pertama
                sAngka1 = Edit1.getText().toString();
                dAngka1 = Double.parseDouble(sAngka1);
                //angka kedua
                sAngka2 = Edit2.getText().toString();
                dAngka2 = Double.parseDouble(sAngka2);
                //hasil
                dHasil = dAngka1/dAngka2;
                tvHasil.setText("" +dHasil);
            }
        });

    }
}