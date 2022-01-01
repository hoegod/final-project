package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class asus extends AppCompatActivity {
    private DrawerLayout drawerLayout;//滑動選單

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asus);
        drawerLayout = findViewById(R.id.drawer_layout);
        ImageButton btn_open = findViewById(R.id.btn_open);

        ImageButton btn_asus = findViewById(R.id.btn_asus);
        ImageButton btn_laptop = findViewById(R.id.btn_laptop);
        ImageButton btn_pad = findViewById(R.id.btn_pad);


        btn_asus.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(asus.this, asuscomputer.class);
                startActivity(intent);
            }
        });
        btn_laptop.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(asus.this, asuslaptop.class);
                startActivity(intent);
            }
        });
        btn_pad.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(asus.this, asuspad.class);
                startActivity(intent);
            }
        });
        btn_open.setOnClickListener(v -> {
            //開啟滑動選單 左側出現
            drawerLayout.openDrawer(GravityCompat.START);
        });

    }
}