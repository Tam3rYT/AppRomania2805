package com.example.travelromania.ITA;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.travelromania.R;

public class AspettiSociali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspetti_sociali);
        PDFView pdfView = findViewById(R.id.socialiPDF);
        pdfView.fromAsset("sociali.pdf").load();
    }
}