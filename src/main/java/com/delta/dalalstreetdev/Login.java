package com.delta.dalalstreetdev;

import android.content.Intent;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        websocket = new WebSocketsService(this);
        websocket.openWebSocket();

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

    public void setLogin() {
        if (validateEmail()) {
            if (validatePassword()) {
                websocket = new WebSocketsService(this);
                websocket.openWebSocket();
                websocket.login_request(email.getText().toString(), password.getText().toString());
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
        intent.putExtra("username", email.getText().toString());
        startActivity(intent);
        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
        websocket.ws.close();
    }

    @Override
    protected void onPause() {
        super.onPause();
        websocket.ws.close();
    }

    @Override
    protected void onResume() {
        super.onResume();
        websocket.openWebSocket();
    }
}
