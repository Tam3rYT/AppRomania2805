package com.example.travelromania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;



    Animation topAnim, bottonAnim;
    ImageView image;
    TextView logo, slogan;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnim = android.view.animation.AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottonAnim = android.view.animation.AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.textView);
        slogan = findViewById(R.id.textView2);


        image.setAnimation(topAnim);
        logo.setAnimation(bottonAnim);
        slogan.setAnimation(bottonAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Home.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

    }
}