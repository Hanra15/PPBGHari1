package com.example.ppbghari1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private int time = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //build handler for intent with time trigger
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // create intent
                Intent splash = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(splash);

                //Selesai
                finish();

            }
        }, time);
    }
}