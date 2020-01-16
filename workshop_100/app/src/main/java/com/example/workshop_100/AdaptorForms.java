package com.example.workshop_100;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptorForms extends RecyclerView.Adapter<AdaptorForms.MyAdaptorForms>{
    ArrayList<Forms> forms;
    DoJoBGivePostion doJoBGivePostion;

    public AdaptorForms(ArrayList<Forms> forms, DoJoBGivePostion doJoBGivePostion) {
        this.forms = forms;
        this.doJoBGivePostion = doJoBGivePostion;
    }

    @NonNull
    @Override
    public MyAdaptorForms onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.form_layout,parent,false);
        MyAdaptorForms pvh = new  MyAdaptorForms(v,doJoBGivePostion);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdaptorForms holder, int position) {
        holder.name.setText(forms.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return forms.size();
    }

    public static class MyAdaptorForms extends RecyclerView.ViewHolder implements View.OnClickListener {
            DoJoBGivePostion doJoBGivePostion ;
            TextView name ;
        public MyAdaptorForms(@NonNull View itemView,DoJoBGivePostion doJoBGivePostion) {
            super(itemView);
            this.doJoBGivePostion = doJoBGivePostion;
            name = itemView.findViewById(R.id.form_layout_form_name);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            doJoBGivePostion.doJoBGivePostion(getAdapterPosition());
        }


    }
}
