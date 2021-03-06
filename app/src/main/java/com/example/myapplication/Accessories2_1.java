package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Accessories2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories2_1);

        ImageButton btn_keyboard1 = findViewById(R.id.btn_keyboard1);
        ImageButton btn_keyboard2 = findViewById(R.id.btn_keyboard2);
        Button btn_forward1_1 = findViewById(R.id.btn_forward1_1);
        Button btn_next1_2 = findViewById(R.id.btn_next1_2);

        btn_forward1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories2_1.this, Accessories1_1.class);
                startActivity(intent);
                finish();
            }
        });

        btn_next1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories2_1.this, Accessories3_1.class);
                startActivity(intent);
                finish();
            }
        });

        btn_keyboard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories2_1.this, Accessories2_2.class);
                startActivity(intent);
            }
        });

        btn_keyboard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Accessories2_1.this, Accessories2_3.class);
                startActivity(intent);
            }
        });

    }
}