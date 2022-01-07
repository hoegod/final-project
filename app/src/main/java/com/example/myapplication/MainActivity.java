package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;//滑動選單

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_phone = findViewById(R.id.btn_phone);
        Button btn_home = findViewById(R.id.btn_home);
        Button btn_others = findViewById(R.id.btn_others);

        Button btn_1 = findViewById(R.id.btn_1);
        Button btn_2 = findViewById(R.id.btn_2);
        Button btn_3 = findViewById(R.id.btn_3);




        drawerLayout = findViewById(R.id.drawer_layout);

        ImageButton btn_open = findViewById(R.id.btn_open);
        AnimationDrawable animation = new AnimationDrawable();
        animation.addFrame(getResources().getDrawable(R.drawable.pj15), 1000);
        animation.addFrame(getResources().getDrawable(R.drawable.pj18), 1000);
        animation.addFrame(getResources().getDrawable(R.drawable.pj19), 1000);
        animation.addFrame(getResources().getDrawable(R.drawable.pj22), 1000);
        animation.addFrame(getResources().getDrawable(R.drawable.pj23), 1000);
        animation.addFrame(getResources().getDrawable(R.drawable.pj26), 1000);



        animation.setOneShot(false);

        ImageView imageAnim = (ImageView) findViewById(R.id.img);
        imageAnim.setBackgroundDrawable(animation);



        // start the animation!
        animation.start();
        btn_1.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, imac27.class);
                startActivity(intent);
            }

        });
        btn_2.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, macbookpro.class);
                startActivity(intent);
            }

        });
        btn_3.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, phoneDetail.class);
                startActivity(intent);
            }

        });
        btn_open.setOnClickListener(v -> {
            //開啟滑動選單 左側出現
            drawerLayout.openDrawer(GravityCompat.START);

            btn_others.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, Accessories1_1.class);
                    startActivity(intent);
                }
            });


            btn_phone.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, phoneActivity.class);
                    startActivity(intent);
                }

            });
            btn_home.setOnClickListener(new View.OnClickListener() { //點擊後執行跳頁的指令
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, comput.class);
                    startActivity(intent);
                }

            });
        });
    }
}
