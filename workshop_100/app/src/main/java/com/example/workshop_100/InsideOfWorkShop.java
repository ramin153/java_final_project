package com.example.workshop_100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InsideOfWorkShop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_of_work_shop);
    }

    public void goToFiilForm(View v){
        Intent intent = new Intent(this,Fill_Form_Main.class);
        startActivity(intent);
    }

    public void makeForm(View v){
        Intent intent = new Intent(this,MakeForm.class);
        startActivity(intent);
    }

    public void payment(View v){
        Intent intent = new Intent(this,PaymentActiviy.class);
        startActivity(intent);
    }
}
