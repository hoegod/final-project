package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class applecomputer extends AppCompatActivity {
    private DrawerLayout drawerLayout;//滑動選單

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applecomputer);
        drawerLayout = findViewById(R.id.drawer_layout);

        ImageButton btn_asus = findViewById(R.id.btn_asus);
        ImageButton btn_laptop = findViewById(R.id.btn_laptop);
        ImageButton btn_open = findViewById(R.id.btn_open);
        Button btn_phone = findViewById(R.id.btn_phone);
        Button btn_home = findViewById(R.id.btn_home);

        btn_asus.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(applecomputer.this, imac27.class);
                startActivity(intent);
            }
        });
        btn_laptop.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(applecomputer.this, imac24.class);
                startActivity(intent);
            }
        });
        btn_open.setOnClickListener(v -> {
            //開啟滑動選單 左側出現
            drawerLayout.openDrawer(GravityCompat.START);
            btn_phone.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClass(applecomputer.this, phoneActivity.class);
                    startActivity(intent);
                }

            });
            btn_home.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClass(applecomputer.this, MainActivity.class);
                    startActivity(intent);
                }

            });
        });
    }
}
