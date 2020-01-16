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

import java.util.ArrayList;


public class ShowStudent extends Fragment {
    RecyclerView recyclerView;
    ArrayList<studen_show_card_data> mySscd;
    AdaptorShowStudentCard adaptorShowStudentCard;
    GoToNextActivity goToFragmentFilTheForm;

    public ShowStudent(GoToNextActivity goToFragmentFilTheForm,ArrayList<studen_show_card_data> mySscd) {
        this.goToFragmentFilTheForm = goToFragmentFilTheForm;
        this.mySscd = mySscd;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_show_student, container, false);
        recyclerView = v.findViewById(R.id.recylert_view_show_student_fragment);

        GetDataForFragment();
        return v;
    }




    void GetDataForFragment(){

        adaptorShowStudentCard = new AdaptorShowStudentCard(mySscd,goToFragmentFilTheForm);
        recyclerView.setAdapter(adaptorShowStudentCard);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }






}
