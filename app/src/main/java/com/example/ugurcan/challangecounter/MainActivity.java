package com.example.ugurcan.challangecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnBirArt;
    Button btnSifirla;
    Button btnIkiArt;
    TextView txtSayac;
    int sayac=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtSayac=findViewById(R.id.txtSayac);
        btnBirArt=findViewById(R.id.btnBirArt);
        btnSifirla=findViewById(R.id.btnSifirla);
        btnIkiArt=findViewById(R.id.btnIkiArt);
        if (savedInstanceState!=null){
            sayac=savedInstanceState.getInt("sayac");
            txtSayac.setText(String.valueOf(sayac));
        }
        else{
            sayac=0;
        }
        btnBirArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayac++;
                txtSayac.setText(String.valueOf(sayac));
            }
        });

        btnSifirla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayac=0;
                txtSayac.setText(String.valueOf(sayac));
            }
        });

        btnIkiArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayac+=2;
                txtSayac.setText(String.valueOf(sayac));
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("sayac",sayac);
    }
}
