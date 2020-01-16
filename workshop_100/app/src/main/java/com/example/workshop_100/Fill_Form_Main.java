package com.example.workshop_100;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class Fill_Form_Main extends AppCompatActivity {
    ShowStudent showStudent;
    ArrayList<studen_show_card_data> mySscd;
    GoToNextActivity goToFragmentFilTheForm;
    FragmentTransaction fragmentTransaction;

    DoJoBGivePostion doJoBGivePostionForForms;
    Fill_the_From_Fragment fill_the_from_fragment;
    FragmentChoseForm fragmentChoseForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill__form__main);
        mySscd = getDataForRecylerViewStudent();
        fill_the_from_fragment = new Fill_the_From_Fragment();

        goToFragmentFilTheForm = new GoToNextActivity() {
            @Override
            public void goToNextActivity(int postion) {
                coommitTransaction(fill_the_from_fragment);
            }
        };

        showStudent = new ShowStudent(goToFragmentFilTheForm,mySscd);

        doJoBGivePostionForForms = new DoJoBGivePostion() {
            @Override
            public void doJoBGivePostion(int postion) {
                coommitTransaction(showStudent);
            }
        };

        fragmentChoseForm =  new FragmentChoseForm(doJoBGivePostionForForms);

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_fill_form_fragment_place,fragmentChoseForm);
        fragmentTransaction.commit();

    }

    void coommitTransaction(Fragment fragment){
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_fill_form_fragment_place,fragment);
        fragmentTransaction.commit();
    }

    ArrayList<studen_show_card_data> getDataForRecylerViewStudent(){
        ArrayList<studen_show_card_data> std = new ArrayList<studen_show_card_data>();
        std.add(new studen_show_card_data("ramin","rowshan","ramin153","somethingLikeAlways"));
        std.add(new studen_show_card_data("mehdi","feghi","mf1378","somethingLikeAlways"));
        std.add(new studen_show_card_data("ali","rostami","alirostami","somethingLikeAlways"));
        std.add(new studen_show_card_data("joghd","izadi","someone","somethingLikeAlways"));
        std.add(new studen_show_card_data("reza","mohamadi","email","somethingLikeAlways"));

        return std;
    }
}
