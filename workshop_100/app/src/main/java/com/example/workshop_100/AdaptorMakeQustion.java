package com.example.workshop_100;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptorMakeQustion extends RecyclerView.Adapter<AdaptorMakeQustion.MyAdaptorMakeQustion> {

    DoJoBGivePostion btndel,btnsave,btnch;
    ArrayList<Qustion> qustions;

    public AdaptorMakeQustion(DoJoBGivePostion btndel, DoJoBGivePostion btnsave, DoJoBGivePostion btnch, ArrayList<Qustion> qustions) {
        this.btndel = btndel;
        this.btnsave = btnsave;
        this.btnch = btnch;
        this.qustions = qustions;
    }



    @NonNull
    @Override
    public MyAdaptorMakeQustion onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.qustion_maker_form_maker,parent,false);
        MyAdaptorMakeQustion myAdaptorMakeQustion = new MyAdaptorMakeQustion(v,btndel,btnsave,btnch,qustions);
        return myAdaptorMakeQustion;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdaptorMakeQustion holder, int position) {
        holder.text.setText(qustions.get(position).getQustuon());
        holder.editText.setText(qustions.get(position).getQustuon());
    }

    @Override
    public int getItemCount() {
        return qustions.size();
    }

    public static class MyAdaptorMakeQustion extends RecyclerView.ViewHolder{
        DoJoBGivePostion btndel,btnsave,btnch;
        TextView text;
        EditText editText;
        Button delete,save,change;
        View all;
        public MyAdaptorMakeQustion(@NonNull final View itemView, DoJoBGivePostion btnDe, final DoJoBGivePostion btnSave
        , DoJoBGivePostion btnChang, final ArrayList<Qustion> qustions){
            super(itemView);
            delete = itemView.findViewById(R.id.qustion_maker_form_delete);
            change = itemView.findViewById(R.id.qustion_maker_form_change);
            save = itemView.findViewById(R.id.qustion_maker_form_save);
            editText = itemView.findViewById(R.id.qustion_maker_form_textToChange);
            text = itemView.findViewById(R.id.qustion_maker_form_text);


            all = itemView;
            btnch = btnChang;
            btndel = btnDe;
            btnsave = btnSave;


            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btndel.doJoBGivePostion(getAdapterPosition());
                    qustions.remove(getAdapterPosition());

                }
            });

            change.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btnch.doJoBGivePostion(getAdapterPosition());
                    change.setVisibility(View.GONE);
                    save.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    text.setVisibility(View.GONE);
                    editText.setText(text.getText().toString());
                }
            });

            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void  onClick(View v) {
                    btnsave.doJoBGivePostion(getAdapterPosition());
                    change.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.GONE);
                    text.setVisibility(View.VISIBLE);
                    save.setVisibility(View.GONE);
                    text.setText(editText.getText().toString());
                    qustions.get(getAdapterPosition()).setQustuon(editText.getText().toString());
                }
            });

        }
    }

}
