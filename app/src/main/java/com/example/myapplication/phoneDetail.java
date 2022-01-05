package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class phoneDetail extends AppCompatActivity {

    ImageView img, back;
    TextView CPU_pm, RAM_pm, ROM_pm, camera_pm, display_pm, battery_pm;

    String CPU, RAM, ROM, camera, display, battery;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_detail);

        Intent i = getIntent(); //passing data to new activity

        //get the data we need
        CPU = i.getStringExtra("CPU");
        image = i.getIntExtra("image", R.drawable.pflip3);
        RAM = i.getStringExtra("RAM");
        ROM = i.getStringExtra("ROM");
        camera = i.getStringExtra("camera");
        display = i.getStringExtra("display");
        battery = i.getStringExtra("battery");

        //find views that was identified by the id attribute
        CPU_pm = findViewById(R.id.CPU_pm);
        RAM_pm = findViewById(R.id.RAM_pm);
        ROM_pm = findViewById(R.id.ROM_pm);
        img = findViewById(R.id.big_image);
        back = findViewById(R.id.back);
        camera_pm = findViewById(R.id.camera_pm);
        display_pm = findViewById(R.id.display_pm);
        battery_pm = findViewById(R.id.battery_pm);

        //set the data from params that you want to display
        CPU_pm.setText(CPU);
        RAM_pm.setText(RAM);
        ROM_pm.setText(ROM);
        camera_pm.setText(camera);
        display_pm.setText(display);
        battery_pm.setText(battery);


        img.setImageResource(image);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(phoneDetail.this, phoneActivity.class);
                startActivity(i);
                finish();

            }
        });

    }
}

