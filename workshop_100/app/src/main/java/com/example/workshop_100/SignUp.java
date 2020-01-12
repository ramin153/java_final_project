package com.example.workshop_100;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;



public class SignUp extends AppCompatActivity  {
    FragmentTransaction fragmentTransaction;
    Intent intent;
    SignupPartTowFragment seceonPageFragment;
    SignUpPartOneFragment firstPageFragment ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        intent = new Intent(this,HomeActivity.class);
        firstPageFragment = new SignUpPartOneFragment();
        seceonPageFragment = new SignupPartTowFragment();
        seceonPageFragment.clikc = new clikable() {
            @Override
            public void click() {
                startActivity(intent);
                finish();
            }
        };
        firstPageFragment.click = new clikable() {
            @Override
            public void click() {
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_singUp,seceonPageFragment);
                fragmentTransaction.commit();
            }
        };
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_singUp,firstPageFragment);
        fragmentTransaction.commit();



    }


}
