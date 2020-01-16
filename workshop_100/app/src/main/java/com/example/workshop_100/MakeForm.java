package com.example.workshop_100;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MakeForm extends AppCompatActivity {
    RecyclerView recyclerView;
    AdaptorMakeQustion adaptorMakeQustion;
    DoJoBGivePostion del,save,change;
    ArrayList<Qustion> qustions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_form);
        qustions = new ArrayList<>();
        qustions.add(new Qustion("go to hell"));
        qustions.add(new Qustion("go to now"));
        qustions.add(new Qustion("go to hell"));
        qustions.add(new Qustion("go to death"));
        recyclerView= findViewById(R.id.make_form_recycleView);

        del = new DoJoBGivePostion() {
            @Override
            public void doJoBGivePostion(int postion) {

            }
        };

        save = new DoJoBGivePostion() {
            @Override
            public void doJoBGivePostion(int postion) {

            }
        };

        change = new DoJoBGivePostion() {
            @Override
            public void doJoBGivePostion(int postion) {

            }
        };
        setRecyclerView();

    }

    void setRecyclerView(){
        adaptorMakeQustion = new AdaptorMakeQustion(del,save,del,qustions);
        recyclerView.setAdapter(adaptorMakeQustion);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }
}
