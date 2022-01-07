package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Accessories3_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories3_1);

        Button btn_forward1_2 = findViewById(R.id.btn_forward1_2);
        Button btn_next1_3 = findViewById(R.id.btn_next1_3);
        ImageButton btn_mouse1 = findViewById(R.id.btn_mouse1);
        ImageButton btn_mouse2 = findViewById(R.id.btn_mouse2);

        btn_forward1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories3_1.this, Accessories2_1.class);
                startActivity(intent);
                finish();
            }
        });

        btn_next1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories3_1.this, Accessories4_1.class);
                startActivity(intent);
                finish();
            }
        });

        btn_mouse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories3_1.this, Accessories3_2.class);
                startActivity(intent);
            }
        });

        btn_mouse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories3_1.this, Accessories3_3.class);
                startActivity(intent);
            }
        });

    }
}