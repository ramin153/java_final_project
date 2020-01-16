package com.example.workshop_100;

import android.content.Context;
import android.content.Intent;
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


public class Fragment_Home_ShowWorkShop extends Fragment {
    RecyclerView recyclerViewAllWorkShop;
    ArrayList<WorkShopCard> workShopCardsALl;
    ApdaptorWorkShopCard awscForAll;
    GoToNextActivity goToNextActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragment__home__show_work_shop, container, false);
        goToNextActivity = new GoToNextActivity() {
            @Override
            public void goToNextActivity(int postion) {
                Intent intent = new Intent(getActivity(),InsideOfWorkShop.class);
                startActivity(intent);


            }
        };
        recyclerViewAllWorkShop = v.findViewById(R.id.Fragment_ShowWorkShop_all);
        setTheAllWorkShop();


        return v;
    }

    ArrayList<WorkShopCard> getAllWorkShopCards(){
        ArrayList<WorkShopCard> wkscardsall = new ArrayList<WorkShopCard>();
        wkscardsall.add(new WorkShopCard("math","ramin",12));
        wkscardsall.add(new WorkShopCard("love","death",100));
        wkscardsall.add(new WorkShopCard("hate","life",200));
        wkscardsall.add(new WorkShopCard("anger","other",400));
        return wkscardsall;
    }

    void setTheAllWorkShop(){
        recyclerViewAllWorkShop.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        workShopCardsALl = getAllWorkShopCards();
        awscForAll = new ApdaptorWorkShopCard(workShopCardsALl,goToNextActivity);
        recyclerViewAllWorkShop.setAdapter(awscForAll);

    }


}
