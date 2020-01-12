package com.example.workshop_100;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ApdaptorWorkShopCard extends RecyclerView.Adapter<ApdaptorWorkShopCard.MyAdaptorWorkSjhopCardHolder> {
    ArrayList<WorkShopCard> workShopCards;

    public ApdaptorWorkShopCard(ArrayList<WorkShopCard> workShopCards) {
        this.workShopCards = workShopCards;
    }

    @Override
    public int getItemCount() {
        return workShopCards.size();
    }


    @Override
    public ApdaptorWorkShopCard.MyAdaptorWorkSjhopCardHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.workshop_card, parent, false);
        MyAdaptorWorkSjhopCardHolder pvh = new MyAdaptorWorkSjhopCardHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(MyAdaptorWorkSjhopCardHolder holder, int position) {

        holder.title.setText(workShopCards.get(position).getName());
        holder.manager.setText(workShopCards.get(position).getName());
        holder.price.setText(workShopCards.get(position).getName());


    }



    public static class MyAdaptorWorkSjhopCardHolder extends RecyclerView.ViewHolder{
        TextView title, price, manager;

        public MyAdaptorWorkSjhopCardHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.card_work_shop_title);
            manager = itemView.findViewById(R.id.card_work_shop_maneger);
            price = itemView.findViewById(R.id.card_work_shop_price);


        }
    }
}
