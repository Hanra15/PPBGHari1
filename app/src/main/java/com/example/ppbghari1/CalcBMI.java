package com.example.ppbghari1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcBMI extends AppCompatActivity {
    private EditText Berat, Tinggi;
    private Button btnHitungBMI;
    private TextView tvHasilBMI, tvAngkaBMI;
    String sBerat, sTinggi;
    double dBerat, dTinggi, dHasilBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_bmi);

        //init
        Berat = findViewById(R.id.Berat);
        Tinggi  = findViewById(R.id.Tinggi);
        btnHitungBMI  = findViewById(R.id.btnHitungBMI);
        tvHasilBMI  = findViewById(R.id.tvHasilBMI);
        tvAngkaBMI = findViewById(R.id.tvAngkaBMI);

        //action

        btnHitungBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //berat
                sBerat = Berat.getText().toString();
                dBerat = Double.parseDouble(sBerat);
                //tinggi
                sTinggi = Tinggi.getText().toString();
                dTinggi = Double.parseDouble(sTinggi);
                //hasil BMI
                dHasilBMI = dBerat/(dTinggi*dTinggi);
                tvAngkaBMI.setText("" +dHasilBMI);

                if (dHasilBMI < 18.5){
                    tvHasilBMI.setText("Berat Badan Kurang");
                }
                else if (dHasilBMI > 18.5 && dHasilBMI <= 24.9){
                    tvHasilBMI.setText("Ideal/Normal");
                }
                else if (dHasilBMI > 25 && dHasilBMI <= 29.9){
                    tvHasilBMI.setText("Kelebihan Berat Badan");
                }
                else if (dHasilBMI >= 30 ){
                    tvHasilBMI.setText("Obesitas");
                }
                else{
                    tvHasilBMI.setText("Diet Woy!!!");
                }
            }
        });

    }
}