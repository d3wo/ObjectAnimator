package com.example.android.valueanimation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }


    @Override
    protected void onStart(){
        super.onStart();

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;



        ImageView gambar = (ImageView) findViewById(R.id.gambar);

        ObjectAnimator animation = ObjectAnimator.ofFloat(gambar, "translationX", -500f,0f);
        animation.setDuration(5000);
        animation.start();
    }
}
