package com.example.workshop_100;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class check_email_frogment extends Fragment {
    Button sendEmail;
    clikable clk;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_check_email_frogment, container, false);
        sendEmail = v.findViewById(R.id.send_email_fragment_check_email);
        sendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clk.click();
            }
        });

        return  v;
    }


}
