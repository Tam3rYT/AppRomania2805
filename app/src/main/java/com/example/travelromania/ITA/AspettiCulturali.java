package com.example.travelromania.ITA;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.travelromania.R;

public class AspettiCulturali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspetti_culturali);

        PDFView pdfView = findViewById(R.id.culturaliPdf);
        pdfView.fromAsset("culturali.pdf").load();

    }
}