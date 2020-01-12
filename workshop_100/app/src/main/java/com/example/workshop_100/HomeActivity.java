package com.example.workshop_100;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {
    static String choose = "4";
    ImageView profileBtn,massageBtn,searchBtn,homeBtn;
    FragmentTransaction fragmentTransaction;

    FragmrntProfile fragmrntProfile ;
    Intent goToSetting;


    FrameLayout main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        profileBtn = findViewById(R.id.profile_icon);
        massageBtn = findViewById(R.id.massage_icon);
        homeBtn = findViewById(R.id.home_icon);
        searchBtn = findViewById(R.id.serach_icon);

//        set inside fragment
        fragmrntProfile= new FragmrntProfile();
        goToSetting = new Intent(this,SettingActivity.class);
        fragmrntProfile.clk_setting= new clikable() {
            @Override
            public void click() {
                startActivity(goToSetting);
            }
        };





        fragmentTransaction= getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_homeActivity,fragmrntProfile);
        fragmentTransaction.commit();

    }

    public void switchPart(View v){
        String tag = v.getTag().toString();

        if(choose.equals(tag)){

            return;
        }


        switch (choose){
            case "1":
                homeBtn.setImageResource(R.drawable.ic_home_outline_2);
                break;

            case "2":
                searchBtn.setImageResource(R.drawable.ic_search_outline);
                break;

            case "3":
                massageBtn.setImageResource(R.drawable.ic_email_outline);
                break;

            case "4":
                profileBtn.setImageResource(R.drawable.ic_user_outline);
                break;


        }


        switch (tag){
            case "1":
                homeBtn.setImageResource(R.drawable.ic_home);
                fragmentTransaction= getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_homeActivity,new Fragment_Home_ShowWorkShop());
                fragmentTransaction.commit();
                break;

            case "2":
                searchBtn.setImageResource(R.drawable.ic_search);
                fragmentTransaction= getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_homeActivity,new FratgmentSearch());
                fragmentTransaction.commit();
                break;

            case "3":
                massageBtn.setImageResource(R.drawable.ic_email);

                fragmentTransaction= getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_homeActivity,new FragmentMassege());
                fragmentTransaction.commit();
                break;

            case "4":
                profileBtn.setImageResource(R.drawable.ic_user_);

                fragmentTransaction= getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_homeActivity,fragmrntProfile);
                fragmentTransaction.commit();
                break;


        }

        choose = tag;

    }

}
