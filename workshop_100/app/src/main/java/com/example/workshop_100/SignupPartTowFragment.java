package com.example.workshop_100;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class SignupPartTowFragment extends Fragment {
    EditText year,day,month;
    Button goToNextPage;
    clikable clikc;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_signup_part_tow, container, false);
        year = v.findViewById(R.id.year);
        month = v.findViewById(R.id.month);
        day = v.findViewById(R.id.day);
        goToNextPage = v.findViewById(R.id.next_fragment_signup);

        goToNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clikc.click();
            }
        });

        day.setFilters( new InputFilter[]{ new MinMaxFilter( "1" , "31" )}) ;
        year.setFilters( new InputFilter[]{ new MinMaxFilter( "1" , "2020" )}) ;
        month.setFilters( new InputFilter[]{ new MinMaxFilter( "1" , "12" )}) ;
        return v;
    }


}
