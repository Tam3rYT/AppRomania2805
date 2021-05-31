package com.example.travelromania.ING;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.travelromania.R;

public class AspettiEconomiciING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspetti_economici_ing);
        PDFView pdfView = findViewById(R.id.EconomiaING_pdf);
        pdfView.fromAsset("EconomiaING.pdf").load();
    }
}