package com.example.ppbghari1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    private Button btnIntent, btnCheck, btnRadio, btnAbout, btnCalculator, btnBMI, btnDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //get variabel id from dashboard layout
        btnIntent = findViewById(R.id.btnIntent);
        btnAbout = findViewById(R.id.btnAbout);
        btnCheck = findViewById(R.id.btnCheck);
        btnRadio = findViewById(R.id.btnRadio);
        btnCalculator = findViewById(R.id.btnCalculator);
        btnBMI = findViewById(R.id.btnBMI);
        btnDatabase = findViewById(R.id.btnDatabase);

        //give action to each button
        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menggunakan splash notofication
                Toast.makeText(getApplicationContext(), "Akses Halaman Intent", Toast.LENGTH_LONG).show();

                //perpindahan
                Intent access_intent = new Intent(Dashboard.this, CekintentActivity.class);
                startActivity(access_intent);

            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menggunakan splash notofication
                Toast.makeText(getApplicationContext(), "Akses Halaman About", Toast.LENGTH_LONG).show();

                //perpindahan
                Intent access_about = new Intent(Dashboard.this, AboutActivity.class);
                startActivity(access_about);
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menggunakan splash notofication
                Toast.makeText(getApplicationContext(), "Akses Halaman Checkbox", Toast.LENGTH_LONG).show();

                //perpindahan
                Intent access_check = new Intent(Dashboard.this, CheckActivity.class);
                startActivity(access_check);
            }
        });

        btnRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menggunakan splash notofication
                Toast.makeText(getApplicationContext(), "Akses Halaman Radio", Toast.LENGTH_LONG).show();

                //perpindahan
                Intent access_radio = new Intent(Dashboard.this, RadioActivity.class);
                startActivity(access_radio);
            }
        });

        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menggunakan splash notofication
                Toast.makeText(getApplicationContext(), "Akses Kalkulator Sederhana", Toast.LENGTH_LONG).show();

                //perpindahan
                Intent access_kalkulator = new Intent(Dashboard.this, KalkulatorActivity.class);
                startActivity(access_kalkulator);

            }
        });
        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menggunakan splash notofication
                Toast.makeText(getApplicationContext(), "Akses Hitung BMI", Toast.LENGTH_LONG).show();

                //perpindahan
                Intent access_BMI = new Intent(Dashboard.this, CalcBMI.class);
                startActivity(access_BMI);

            }
        });
        btnDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menggunakan splash notif
                Toast.makeText(getApplicationContext(), "Akses Database SQL", Toast.LENGTH_SHORT).show();
                //perpindahan
                Intent access_Database = new Intent(Dashboard.this, DatabaseActivity.class);
                startActivity(access_Database);
            }
        });

    }
}