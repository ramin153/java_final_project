package com.example.workshop_100;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import java.util.ArrayList;

public class PaymentActiviy extends AppCompatActivity {
    ShowStudent showStudent;
    ArrayList<studen_show_card_data> mySscd;
    GoToNextActivity goToFragmentFilTheForm;
    FragmentTransaction fragmentTransaction;
    Payment_fragment payment_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_activiy);
        mySscd = getDataForRecylerViewStudent();
        payment_fragment = new Payment_fragment();
        goToFragmentFilTheForm = new GoToNextActivity() {
            @Override
            public void goToNextActivity(int postion) {
                coommitTransaction(payment_fragment);
            }
        };

        showStudent = new ShowStudent(goToFragmentFilTheForm,mySscd);


        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.payment_main_activity,showStudent);
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

    void coommitTransaction(Fragment fragment){
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.payment_main_activity,fragment);
        fragmentTransaction.commit();
    }
}
