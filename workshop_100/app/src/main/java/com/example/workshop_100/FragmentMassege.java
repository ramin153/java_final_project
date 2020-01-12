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
import java.util.List;


public class FragmentMassege extends Fragment {

    ArrayList<Message> messages;
    MassegeAdaptor massegeAdaptor;
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_massege, container, false);
        recyclerView = v.findViewById(R.id.serach_recyler_view);
        messages = getMessages();
        setRecyclerView();
        return v;
    }

    private ArrayList<Message> getMessages(){
        ArrayList<Message> allMassege = new ArrayList<>();

        allMassege.add(new Message("go","wowwoooooooooooooooooooooooooooowowowowo","98/9/9"));
        allMassege.add(new Message("go","wowwoooooooooooooooooooooooooooowowowowo","98/9/9"));
        allMassege.add(new Message("go","wowwoooooooooooooooooooooooooooowowowowo","98/9/9"));
        allMassege.add(new Message("go","wowwoooooooooooooooooooooooooooowowowowo","98/9/9"));

        return allMassege;
    }

    private void setRecyclerView(){
        massegeAdaptor = new MassegeAdaptor(messages);
        recyclerView.setAdapter(massegeAdaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

}
