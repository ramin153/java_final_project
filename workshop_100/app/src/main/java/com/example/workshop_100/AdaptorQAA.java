package com.example.workshop_100;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptorQAA extends  RecyclerView.Adapter<AdaptorQAA.MyAdaptorQAA>{
    ArrayList<QustionAndAnswer> QAA;

    public AdaptorQAA(ArrayList<QustionAndAnswer> QAA) {
        this.QAA = QAA;
    }

    @NonNull
    @Override
    public MyAdaptorQAA onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.question_answer,parent,false);
        MyAdaptorQAA pvh = new MyAdaptorQAA(v,QAA);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdaptorQAA holder, int position) {
        holder.textView.setText(QAA.get(position).getQustion());
        holder.editText.setText(QAA.get(position).getAnwer());
    }

    @Override
    public int getItemCount() {
        return QAA.size();
    }


    public static class MyAdaptorQAA extends RecyclerView.ViewHolder {
        TextView textView;
        EditText editText;
        ArrayList<QustionAndAnswer> myQaa;
        public MyAdaptorQAA(@NonNull View itemView,ArrayList<QustionAndAnswer> QAA) {
            super(itemView);
            myQaa = QAA;
            textView = itemView.findViewById(R.id.question_answer_q_recyclerView);
            editText = itemView.findViewById(R.id.question_answer_A_recyclerView);

            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    myQaa.get(getAdapterPosition()).setAnwer(editText.getText().toString());
                }
            });

        }
    }
}
