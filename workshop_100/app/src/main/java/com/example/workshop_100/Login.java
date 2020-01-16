package com.example.workshop_100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.security.spec.ECField;
import java.util.HashMap;


public class Login extends AppCompatActivity {
    ImageView backgrounImage;
    EditText username,password;
    String URL_LOGiN ="/login";
    String API_LOGIN = "http://172.0.0.1";
    String PORT_LOGIN = ":5000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        backgrounImage = findViewById(R.id.background_Image_login);
        username = findViewById(R.id.Login_acti_username);
        password = findViewById(R.id.login_acti_password);


    }

    public void SignUp(View v){
        Intent intent = new Intent(this,SignUp.class);
        startActivity(intent);
        finish();
    }



    public void loginBtn(View v){
        if(loginResult()){
            Intent intent = new Intent(this,HomeActivity.class);
            startActivity(intent);
            finish();
        }

    }

    public void forgotPassword_act(View v){
        Intent intent = new Intent(this,ForgotPassword.class);
        startActivity(intent);

    }

    boolean loginResult(){

        String user;
        String pas;
        user = username.getText().toString();
        pas = password.getText().toString();

        if(pas.equals("") && user.equals("")){
            Toast.makeText(getApplicationContext(),"you didn't enter anything",Toast.LENGTH_SHORT).show();


            return false;
        }else if(pas.equals("")){
            Toast.makeText(getApplicationContext(),"you didn't enter password",Toast.LENGTH_SHORT).show();

            return false;
        }else if(user.equals("")){
            Toast.makeText(getApplicationContext(),"you didn't enter userName",Toast.LENGTH_SHORT).show();

            return false;
        }
        password.setText("");
        boolean result;
        try {
            result = checkValidPerson(user,pas);
        }catch (Exception e){
            result = false;
        }


        if(!result){

        }


        return result;

    }


    boolean checkValidPerson(String user,String Pas) throws Exception{
        final Boolean[] ress = new Boolean[1];
        HashMap<String,String> map = new HashMap<>();
        map.put("user",user);
        map.put("pass",Pas);
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, API_LOGIN + PORT_LOGIN + URL_LOGiN, new JSONObject(map),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            String statuce = response.getString("status");
                            if(statuce.equals("0")){
                                Toast.makeText(getApplicationContext(),"you didnt login yet",Toast.LENGTH_SHORT).show();
                                ress[0] = false;
                            }else if(statuce.equals("1")){
                                Toast.makeText(getApplicationContext(),"yesssssssssssssss",Toast.LENGTH_SHORT).show();
                                ress[0] = true;
                            }
                        }catch (Exception e){
                            Toast.makeText(getApplicationContext(),"some erro hapend",Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("fuck", "onErrorResponse: ");
                ress[0] = false;
                error.printStackTrace();
                Toast.makeText(getApplicationContext(),"FUCK",Toast.LENGTH_SHORT).show();
                Log.d("fuck", "onErrorResponse: ");

            }
        });

        requestQueue.add(jsonObjectRequest);
        requestQueue.start();



        return ress[0];
    }



}
