package com.example.workshop_100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class Login extends AppCompatActivity {
    ImageView backgrounImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        backgrounImage = findViewById(R.id.background_Image_login);



    }

    public void SignUp(View v){
        Intent intent = new Intent(this,SignUp.class);
        startActivity(intent);
        finish();
    }



    public void loginBtn(View v){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
        finish();
    }

    public void forgotPassword_act(View v){
        Intent intent = new Intent(this,ForgotPassword.class);
        startActivity(intent);

    }
}
