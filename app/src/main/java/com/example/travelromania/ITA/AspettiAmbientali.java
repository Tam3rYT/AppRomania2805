package com.example.travelromania.ITA;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.travelromania.R;
import com.github.barteksc.pdfviewer.PDFView;

public class AspettiAmbientali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspetti_ambientali);

        PDFView pdfView = findViewById(R.id.ambientaliPdf);
        pdfView.fromAsset("ambientali.pdf").load();
    }
}