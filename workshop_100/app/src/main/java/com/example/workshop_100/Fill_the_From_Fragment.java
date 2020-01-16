package com.example.workshop_100;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class Fill_the_From_Fragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<QustionAndAnswer> qaa;
    AdaptorQAA adaptorQAA;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fill_the__from_, container, false);
        recyclerView = v.findViewById(R.id.fragment_fill_the_form_recycleView);

        setRecyclerView();
        return v;
    }

    void setRecyclerView(){
        qaa = getQustion();
        adaptorQAA =new AdaptorQAA(qaa);
        recyclerView.setAdapter(adaptorQAA);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    ArrayList<QustionAndAnswer> getQustion(){
        ArrayList<QustionAndAnswer> q = new ArrayList<>();
        q.add(new QustionAndAnswer("go?") );
        q.add(new QustionAndAnswer("where?") );

        q.add(new QustionAndAnswer("when?") );
        q.add(new QustionAndAnswer("why?") );

        return q;
    }

}
