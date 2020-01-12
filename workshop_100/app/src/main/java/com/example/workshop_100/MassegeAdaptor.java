package com.example.workshop_100;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MassegeAdaptor extends RecyclerView.Adapter<MassegeAdaptor.MyMessageHolder> {
    List<Message> messages;

    public MassegeAdaptor(ArrayList<Message> messages) {
        this.messages = messages;
    }

    @Override
    public MassegeAdaptor.MyMessageHolder onCreateViewHolder( ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.masseage_activity, viewGroup, false);
        MyMessageHolder pvh = new MyMessageHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyMessageHolder holder, int position) {
        holder.title.setText(messages.get(position).getTitle());
        holder.detail.setText(messages.get(position).getMain());
        holder.time.setText(messages.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public static class MyMessageHolder extends RecyclerView.ViewHolder {

        TextView time;
        TextView detail;
        TextView title;

        MyMessageHolder(View itemView) {
            super(itemView);

            time = itemView.findViewById(R.id.massage_data_activity);
            detail = itemView.findViewById(R.id.massage_detail_activity);
            title = itemView.findViewById(R.id.massage_title_activity);

        }
    }

}
