package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Accessories4_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories4_1);

        Button btn_forward1_3 = findViewById(R.id.btn_forward1_3);
        Button btn_next1_4 = findViewById(R.id.btn_next1_4);
        ImageButton btn_videocard1 = findViewById(R.id.btn_videocard1);
        ImageButton btn_videocard2 = findViewById(R.id.btn_videocard2);

        btn_forward1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories4_1.this, Accessories3_1.class);
                startActivity(intent);
                finish();
            }
        });

        btn_next1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories4_1.this, Accessories5_1.class);
                startActivity(intent);
                finish();
            }
        });

        btn_videocard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories4_1.this, Accessories4_2.class);
                startActivity(intent);
            }
        });

        btn_videocard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories4_1.this, Accessories4_3.class);
                startActivity(intent);
            }
        });
    }
}