package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class asuslaptop extends AppCompatActivity {
    private DrawerLayout drawerLayout;//滑動選單


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asuslaptop);
        drawerLayout = findViewById(R.id.drawer_layout);

        ImageButton btn_asus = findViewById(R.id.btn_asus);
        ImageButton btn_laptop = findViewById(R.id.btn_laptop);
        ImageButton btn_open = findViewById(R.id.btn_open);
        btn_asus.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(asuslaptop.this, asusx515.class);
                startActivity(intent);
            }
        });
        btn_laptop.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(asuslaptop.this, asusx517.class);
                startActivity(intent);
            }
        });
        btn_open.setOnClickListener(v -> {
            //開啟滑動選單 左側出現
            drawerLayout.openDrawer(GravityCompat.START);
        });
    }
}
