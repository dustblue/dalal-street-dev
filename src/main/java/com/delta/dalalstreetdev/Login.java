package com.delta.dalalstreetdev;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements Listener {

    EditText email, password;
    TextInputLayout email_input, password_input;
    Button login;
    WebSocketsService websocket;
    String username, pass;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        sharedPreferences = getSharedPreferences("dalal",MODE_PRIVATE);
        websocket = new WebSocketsService(this,this);
        websocket.openWebSocket();
    }
    private boolean retrieveSharedPrefs() {
        try{
            username = sharedPreferences.getString("username",null);
            pass = sharedPreferences.getString("password",null);
        }catch(NullPointerException e){
            e.printStackTrace();
            return false;
        }
        if (username != null && pass != null)
            return true;
        else return false;
    }

    public void setLogin() {
        if (validateEmail()) {
            if (validatePassword()) {
                websocket = new WebSocketsService(this,this);
                websocket.openWebSocket();
                username =email.getText().toString();
                pass =password.getText().toString();
                websocket.login_request(username, pass);
            }
        }
    }

    public boolean validateEmail() {
        if (email.getText().toString().trim().isEmpty()) {
            email_input.setError("enter an email");
            email.requestFocus();
            return false;
        } else if (!email.getText().toString().contains("@")) {
            email_input.setError("enter a valid email");
            email.requestFocus();
            return false;
        } else {
            email_input.setErrorEnabled(false);
        }
        return true;
    }

    public boolean validatePassword() {
        if (password.getText().toString().trim().isEmpty()) {
            password_input.setError("enter a password");
            password.requestFocus();
            return false;
        } else {
            password_input.setErrorEnabled(false);
        }
        return true;
    }

    @Override
    public void onCallback() {
        //Login Callback
        Intent intent = new Intent(this, Home.class);
        intent.putExtra("username", username);
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString("username",username);
        editor.putString("password",pass);
        editor.apply();
        startActivity(intent);
        finish();
    }

    @Override
    public void connectionEstablished() {
        if(retrieveSharedPrefs()){
            websocket.login_request(username,pass);
        }else{
            email = (EditText) findViewById(R.id.email);
            password = (EditText) findViewById(R.id.password);
            email_input = (TextInputLayout) findViewById(R.id.email_input);
            password_input = (TextInputLayout) findViewById(R.id.password_input);
            login = (Button) findViewById(R.id.button_login);

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setLogin();
                }
            });
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        try{
            websocket.ws.close();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
//        try{
//            websocket.ws.close();
//        }catch (NullPointerException e){
//            e.printStackTrace();
//        }
    }

    @Override
    protected void onResume() {
        super.onResume();
//        try{
//            if(retrieveSharedPrefs()){
//                websocket.login_request(username,pass);
//            }
//        }catch (NullPointerException e){
//            e.printStackTrace();
//        }
    }
}
