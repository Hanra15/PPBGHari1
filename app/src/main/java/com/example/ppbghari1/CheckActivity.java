package com.example.ppbghari1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity {

    //deklarasi variabel
    private CheckBox cGoogle, cTokped, cAmazon, cMicrosoft;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        //assign variable from layout to java class
        cGoogle = findViewById(R.id.check1);
        cTokped = findViewById(R.id.check2);
        cAmazon = findViewById(R.id.check3);
        cMicrosoft = findViewById(R.id.check4);
        btnSubmit = findViewById(R.id.btnPilihan);

        //give action to button pilihan while clicked
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //initial string as start
                String pilihan = "";

                //logic option while clicked id
                if(cGoogle.isChecked()){
                    pilihan+= "Google \n";
                }

                if(cTokped.isChecked()){
                    pilihan+= "Tokopedia \n";
                }

                if(cAmazon.isChecked()){
                    pilihan+= "Amazon \n";
                }

                if(cMicrosoft.isChecked()){
                    pilihan+= "Microsoft \n";
                }


                //show selected option with Toast
                Toast.makeText(getApplicationContext(), "Anda Memilih : \n" +pilihan, Toast.LENGTH_LONG).show();


            }
        });
    }

}