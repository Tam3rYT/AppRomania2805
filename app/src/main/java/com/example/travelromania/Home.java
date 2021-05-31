package com.example.travelromania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.travelromania.ING.Inglese;
import com.example.travelromania.ITA.Italia;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void ApriMenuITA(View v) {

        Intent i = new Intent(this, Italia.class);
        startActivity(i);

    }

    public void ApriMenuING(View v) {

        Intent i = new Intent(this, Inglese.class);
        startActivity(i);

    }























































    public void SegretoTamer(View v) {
        Intent i = new Intent(this,ProducedByTamer.class);
                startActivity(i);
    }
}
