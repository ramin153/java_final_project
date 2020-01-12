package com.example.workshop_100;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptor_Qustion_Form_maker extends RecyclerView.Adapter<Adaptor_Qustion_Form_maker.MyAQFM> {
    ArrayList<Qustion_From_maker> qustions;

    public Adaptor_Qustion_Form_maker(ArrayList<Qustion_From_maker> qustions) {
        this.qustions = qustions;
    }


    @Override
    public Adaptor_Qustion_Form_maker.MyAQFM onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.qustion_maker_form_maker, parent, false);
        MyAQFM pvh = new MyAQFM(v);
        return pvh;

    }

    @Override
    public void onBindViewHolder(@NonNull MyAQFM holder, int position) {
        Qustion_From_maker q =qustions.get(position);
        holder.text.setText(q.getQustion());
        holder.textToChnage.setText(q.getQustion());

    }

    @Override
    public int getItemCount() {
        return qustions.size();
    }

    public static class MyAQFM extends RecyclerView.ViewHolder{
        Button save;
        Button change;
        Button delete;
        EditText textToChnage;
        TextView text;

        MyAQFM(View itemView) {
            super(itemView);

            text = itemView.findViewById(R.id.qustion_maker_form_text);
            textToChnage = itemView.findViewById(R.id.qustion_maker_form_textToChange);
            save = itemView.findViewById(R.id.qustion_maker_form_save);
            delete = itemView.findViewById(R.id.qustion_maker_form_delete);
            change = itemView.findViewById(R.id.qustion_maker_form_change);


        }

    }
}
