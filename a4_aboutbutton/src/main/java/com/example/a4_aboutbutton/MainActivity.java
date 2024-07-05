package com.example.a4_aboutbutton;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.image1);
        findViewById(R.id.centerr).setOnClickListener(this);
        findViewById(R.id.fitcenter).setOnClickListener(this);
        findViewById(R.id.centertop).setOnClickListener(this);
        findViewById(R.id.centerinseide).setOnClickListener(this);
        findViewById(R.id.fitxy).setOnClickListener(this);
        findViewById(R.id.fitstart).setOnClickListener(this);
        findViewById(R.id.fitend).setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.centerr){
            iv.setScaleType(ImageView.ScaleType.CENTER);
        }else if (v.getId()==R.id.fitcenter){
            iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }else if (v.getId()==R.id.centertop){
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }else if (v.getId()==R.id.centerinseide){
            iv.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }else if (v.getId()==R.id.fitxy){
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
        }else if (v.getId()==R.id.fitstart){
            iv.setScaleType(ImageView.ScaleType.FIT_START);
        }else if (v.getId()==R.id.fitend){
            iv.setScaleType(ImageView.ScaleType.FIT_END);
        }

    }
}