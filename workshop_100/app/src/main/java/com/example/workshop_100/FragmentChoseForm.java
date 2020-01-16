package com.example.workshop_100;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FragmentChoseForm extends Fragment {
    ArrayList<Forms> forms;
    RecyclerView recyclerView;
    AdaptorForms adaptorForms;
    DoJoBGivePostion doJoBGivePostion;

    public FragmentChoseForm(DoJoBGivePostion doJoBGivePostion) {
        this.doJoBGivePostion = doJoBGivePostion;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_chose_form, container, false);
        recyclerView  = v.findViewById(R.id.Fragment_chose_form_recyle_view);
        addRecyleView();

        return v;
    }

    void addRecyleView(){
        forms = getForms();
        adaptorForms = new AdaptorForms(forms,doJoBGivePostion);
        recyclerView.setAdapter(adaptorForms);

        int spanCount = 3; // 3 columns
        int spacing = 50; // 50px
        boolean includeEdge = false;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));

    }

    ArrayList<Forms> getForms(){
        ArrayList<Forms> f = new ArrayList<Forms>();

        f.add(new Forms("first"));
        f.add(new Forms("second"));
        f.add(new Forms("third"));
        f.add(new Forms("forth"));
        f.add(new Forms("fifth"));
        f.add(new Forms("sixth"));
        f.add(new Forms("seventh"));



        return f;

    }


}
