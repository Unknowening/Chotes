package com.example.chotes;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Login extends AppCompatActivity {

    Button bLogin;
    EditText eUsername, ePassword;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eUsername = (EditText) findViewById(R.id.UsernameEdit);
        ePassword = (EditText) findViewById(R.id.PasswordEdit);
        bLogin = (Button) findViewById(R.id.LoginButton);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}