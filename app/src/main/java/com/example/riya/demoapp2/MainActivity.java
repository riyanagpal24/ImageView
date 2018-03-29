package com.example.riya.demoapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.imageView);
    }

    public void fade(View view) {

        image.animate().rotation(360).scaleX(0.5f).scaleY(0.5f).setDuration(3000);
        //image.animate().alpha(0f).setDuration(2000);
        //image.setImageResource(R.drawable.img2);
    }
}
