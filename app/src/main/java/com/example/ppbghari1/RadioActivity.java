package com.example.ppbghari1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {
    private RadioGroup rgSmartphone;
    private RadioButton rbPilihan;
    private Button btnPilihan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        //assign variable from layout to java class
        rgSmartphone = findViewById(R.id.rgSmartphone);
        btnPilihan = findViewById(R.id.btnradio);

        //initiate a function to show option
        tampilkanPilihan();

    }

    public void tampilkanPilihan(){
        btnPilihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //assign radio button id in radio group
                int selectedId = rgSmartphone.getCheckedRadioButtonId();

               //get selected radio button id
                rbPilihan = findViewById(selectedId);

                //show selected option with Toast
                Toast.makeText(getApplicationContext(), "Anda Memilih Smartphone : \n" +rbPilihan.getText(), Toast.LENGTH_LONG).show();
            }
        });

    }
}