package com.example.travelromania.ITA;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.travelromania.R;
import com.github.barteksc.pdfviewer.PDFView;

public class AspettiEconomici extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspetti_economici);
        PDFView pdfView = findViewById(R.id.economiciPdf);
        pdfView.fromAsset("economici.pdf").load();


    }
}