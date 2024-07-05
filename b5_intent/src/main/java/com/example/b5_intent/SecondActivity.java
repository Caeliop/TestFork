package com.example.b5_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        Intent recvintent = getIntent();
        Button btn2 = findViewById(R.id.button2);
//        String message = recvintent.getStringExtra("message");
        Bundle extras = recvintent.getExtras();
        String message = extras.getString("message");
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        Button btn22 = findViewById(R.id.button2);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(newintent);
            }
        });

    }
}