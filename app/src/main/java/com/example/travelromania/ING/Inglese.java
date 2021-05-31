package com.example.travelromania.ING;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.travelromania.ITA.AspettiAmbientali;
import com.example.travelromania.ITA.AspettiCulturali;
import com.example.travelromania.ITA.AspettiEconomici;
import com.example.travelromania.ITA.AspettiFisici;
import com.example.travelromania.ITA.AspettiPolitici;
import com.example.travelromania.ITA.AspettiSociali;
import com.example.travelromania.ITA.AspettiStorici;
import com.example.travelromania.R;

public class Inglese extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inglese);
    }

    public void apriStoriciING(View v) {

        Intent i = new Intent(this, AspettiStoriciING.class);
        startActivity(i);
    }


    public void apriSocialiING(View v) {

        Intent i = new Intent(this, AspettiSocialiING.class);
        startActivity(i);
    }

    public void apriPoliticiING(View v) {

        Intent i = new Intent(this, AspettiPoliticiING.class);
        startActivity(i);
    }

    public void apriFisiciING(View v) {

        Intent i = new Intent(this, AspettiFisiciING.class);
        startActivity(i);
    }

    public void apriEconomiciING(View v) {

        Intent i = new Intent(this, AspettiEconomiciING.class);
        startActivity(i);
    }

    public void apriCulturaliING(View v) {

        Intent i = new Intent(this, AspettiCulturaliING.class);
        startActivity(i);
    }

    public void apriAmbientaliING(View v) {

        Intent i = new Intent(this, AspettiAmbientaliING.class);
        startActivity(i);
    }



}