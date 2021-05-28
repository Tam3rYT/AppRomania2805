package com.example.travelromania.ITA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.travelromania.R;


public class Italia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italia);
    }
    public void apriStorici(View v) {

        Intent i = new Intent(this, AspettiStorici.class);
        startActivity(i);
    }


    public void apriSociali(View v) {

        Intent i = new Intent(this, AspettiSociali.class);
        startActivity(i);
    }

    public void apriPolitici(View v) {

        Intent i = new Intent(this, AspettiPolitici.class);
        startActivity(i);
    }

    public void apriFisici(View v) {

        Intent i = new Intent(this, AspettiFisici.class);
        startActivity(i);
    }

    public void apriEconomici(View v) {

        Intent i = new Intent(this, AspettiEconomici.class);
        startActivity(i);
    }

    public void apriCulturali(View v) {

        Intent i = new Intent(this, AspettiCulturali.class);
        startActivity(i);
    }

    public void apriAmbientali(View v) {

        Intent i = new Intent(this, AspettiAmbientali.class);
        startActivity(i);
    }

}