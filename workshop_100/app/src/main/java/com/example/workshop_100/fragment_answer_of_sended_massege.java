package com.example.workshop_100;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class fragment_answer_of_sended_massege extends Fragment {
    Button send_again,checkEmail;
    clikable clk_sendAgain,clk_checkEmail;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fragment_answer_of_sended_massege, container, false);
        send_again = v.findViewById(R.id.fragment_sended_masege_send_again);
        checkEmail = v.findViewById(R.id.fragment_sended_email_check_email);

        send_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clk_sendAgain.click();
            }
        });

        checkEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clk_checkEmail.click();
            }
        });

        return v;
    }


}
