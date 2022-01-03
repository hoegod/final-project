package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Accessories5_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories5_1);

        Button btn_forward1_4 = findViewById(R.id.btn_forward1_4);
        ImageButton btn_power1 = findViewById(R.id.btn_power1);
        ImageButton btn_power2 = findViewById(R.id.btn_power2);

        btn_forward1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories5_1.this, Accessories4_1.class);
                startActivity(intent);
                finish();
            }
        });

        btn_power1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories5_1.this, Accessories5_2.class);
                startActivity(intent);
            }
        });

        btn_power2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories5_1.this, Accessories5_3.class);
                startActivity(intent);
            }
        });
    }
}