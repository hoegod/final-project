package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Accessories1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories1_1);

        ImageButton btn_headphone1 = findViewById(R.id.btn_headphone1);
        ImageButton btn_headphone2 = findViewById(R.id.btn_headphone2);
        Button btn_next1_1 = findViewById(R.id.btn_next1_1);

        btn_next1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories1_1.this, Accessories2_1.class);
                startActivity(intent);
                finish();
            }
        });

        btn_headphone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories1_1.this, Accessories1_2.class);
                startActivity(intent);
            }
        });

        btn_headphone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories1_1.this, Accessories1_3.class);
                startActivity(intent);
            }
        });
    }
}