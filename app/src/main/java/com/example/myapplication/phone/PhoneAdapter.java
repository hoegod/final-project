package com.example.myapplication.phone;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.phoneDetail;
import com.example.myapplication.R;
import com.example.myapplication.phone.PhoneRecycle;


import java.util.List;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.PhoneViewHolder> {

    Context context;
    List<PhoneRecycle> phoneRecycleList;

    public PhoneAdapter(Context context, List<PhoneRecycle> phoneRecycleList) {
        this.context = context;
        this.phoneRecycleList = phoneRecycleList;
    }

    @NonNull
    @Override
    public PhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.phone_viewed_items, parent, false);

        return new PhoneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneViewHolder holder, final int position) {

        holder.bg.setBackgroundResource(phoneRecycleList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(context, phoneDetail.class);
                i.putExtra("CPU", phoneRecycleList.get(position).getCPU());
                i.putExtra("RAM", phoneRecycleList.get(position).getRAM());
                i.putExtra("ROM", phoneRecycleList.get(position).getROM());
                i.putExtra("camera", phoneRecycleList.get(position).getCamera());
                i.putExtra("display", phoneRecycleList.get(position).getDisplay());
                i.putExtra("battery", phoneRecycleList.get(position).getBattery());
                i.putExtra("image", phoneRecycleList.get(position).getImageUrl());

                context.startActivity(i);
            }
        });

    }
    @Override
    public int getItemCount() {
        return phoneRecycleList.size();
    }

    public static class PhoneViewHolder extends RecyclerView.ViewHolder{

        ConstraintLayout bg;

        public PhoneViewHolder(@NonNull View itemView) {
            super(itemView);
            bg = itemView.findViewById(R.id.recently_layout);

        }
    }

}

