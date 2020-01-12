package com.example.workshop_100;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class FragmrntProfile extends Fragment {

    String imageUrl ="https://unsplash.com/photos/1SAnrIxw5OY/download?force=true";
    ImageView setting;
    clikable clk_setting;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragmrnt_profile, container, false);
        setting = v.findViewById(R.id.Fragement_profile_setting);



        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clk_setting.click();
            }
        });

        return v;
    }


}
