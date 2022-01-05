package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.phone.PhoneAdapter;
import com.example.myapplication.phone.PhoneRecycle;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import static com.example.myapplication.R.drawable.*;


public class phoneActivity extends AppCompatActivity {

    RecyclerView PhoneRecycle;
    PhoneAdapter PhoneAdapter;
    List<PhoneRecycle> phoneRecycleList;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        PhoneRecycle = findViewById(R.id.phone_recycler);



        // adding data to model
        phoneRecycleList= new ArrayList<>();
        phoneRecycleList.add(new PhoneRecycle("八核心處理器", "8GB", "128/256 GB", "1200/1000萬畫素", "2640x1080(FHD+)", "3300", pflip3));
        phoneRecycleList.add(new PhoneRecycle("八核心處理器", "12GB", "256/512 GB", "1200/1000萬畫素", "2208x1768(QXGA+)", "4400",pfold3));
        phoneRecycleList.add(new PhoneRecycle("八核心處理器", "8GB", "128/256 GB", "1200+6400/1000萬畫素", "2400x1080(FHD+)", "4000",ps21));
        phoneRecycleList.add(new PhoneRecycle("八核心處理器", "8GB", "256 GB", "1200+6400/1000萬畫素", "2400x1080(FHD+)", "4300",note20));
        phoneRecycleList.add(new PhoneRecycle("六核心處理器", "3GB", "64/128 GB", "1200/700萬畫素", "1334x750", "1821",piphonese));
        phoneRecycleList.add(new PhoneRecycle("八核心處理器", "8GB", "128/256 GB", "1200/1000萬畫素", "2640x1080(FHD+)", "3300",iphone12));
        phoneRecycleList.add(new PhoneRecycle("六核心處理器", "4GB", "128/256/512 GB", "1200萬畫素", "2532x1170(HDR)", "3227",iphone13));
        phoneRecycleList.add(new PhoneRecycle("六核心處理器", "6GB", "128/256/512GB/1TB", "1200萬畫素", "2532x1170(HDR)", "3100",iphone13pro));




        setPhoneRecycle(phoneRecycleList);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(phoneActivity.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        });

    }


    private void setPhoneRecycle(List<PhoneRecycle> phoneDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        PhoneRecycle.setLayoutManager(layoutManager);
        PhoneAdapter = new PhoneAdapter(this,phoneDataList);
        PhoneRecycle.setAdapter(PhoneAdapter);
    }



}