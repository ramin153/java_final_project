package com.example.workshop_100;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class ForgotPassword extends AppCompatActivity {

    check_email_frogment check_email_frogment;
    fragment_answer_of_sended_massege fragment_answer_of_sended_massege;
    FragmentTransaction fragmentTransaction;
    Change_password_fragment change_password_fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        check_email_frogment = new check_email_frogment();
        fragment_answer_of_sended_massege = new fragment_answer_of_sended_massege();
        change_password_fragment = new Change_password_fragment();

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.forgot_password_main,check_email_frogment);
        fragmentTransaction.commit();

        check_email_frogment.clk= new clikable() {
            @Override
            public void click() {
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.forgot_password_main,fragment_answer_of_sended_massege);
                fragmentTransaction.commit();
            }
        };

        fragment_answer_of_sended_massege.clk_checkEmail= new clikable() {
            @Override
            public void click() {
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.forgot_password_main,change_password_fragment);
                fragmentTransaction.commit();
            }
        };

        change_password_fragment.clk = new clikable() {
            @Override
            public void click() {
                finish();
            }
        };

    }
}
