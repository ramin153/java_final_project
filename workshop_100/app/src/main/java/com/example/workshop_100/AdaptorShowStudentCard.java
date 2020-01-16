package com.example.workshop_100;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class AdaptorShowStudentCard extends  RecyclerView.Adapter<AdaptorShowStudentCard.MyAdaptorShowStudentCard>{
    ArrayList<studen_show_card_data> sscd;
    GoToNextActivity goToNextActivity;

    public AdaptorShowStudentCard(ArrayList<studen_show_card_data> sscd, GoToNextActivity goToNextActivity) {
        this.sscd = sscd;
        this.goToNextActivity = goToNextActivity;
    }

    @NonNull
    @Override
    public MyAdaptorShowStudentCard onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_card,parent,false);
        MyAdaptorShowStudentCard MASSC = new MyAdaptorShowStudentCard(v,goToNextActivity);
        return MASSC;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdaptorShowStudentCard holder, int position) {
        holder.lastName.setText(sscd.get(position).getName());
        holder.name.setText(sscd.get(position).getName());
        holder.username.setText(sscd.get(position).getUserName());
        //holder.profile.setImageResource(sscd.get(position).getImage_url());
    }

    @Override
    public int getItemCount() {
        return sscd.size();
    }


    static public class MyAdaptorShowStudentCard extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView profile;
        TextView name,
                 username,
                 lastName;
        GoToNextActivity goToNextActivity;

        public MyAdaptorShowStudentCard(View itemView,GoToNextActivity goToNextActivity) {
            super(itemView);
            profile = itemView.findViewById(R.id.student_card_image);
            name = itemView.findViewById(R.id.student_card_name);
            lastName = itemView.findViewById(R.id.student_card_lastName);
            username = itemView.findViewById(R.id.student_card_username);
            this.goToNextActivity = goToNextActivity;
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            goToNextActivity.goToNextActivity(getAdapterPosition());
        }
    }

}
