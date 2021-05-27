package com.example.chotes;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class Login extends AppCompatActivity {

    Button bLogin;
    EditText eUsername, ePassword;
    TextView eRegisterNow;
    boolean loginIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eUsername = (EditText) findViewById(R.id.UsernameEdit);
        ePassword = (EditText) findViewById(R.id.PasswordEdit);
        bLogin = (Button) findViewById(R.id.LoginButton);
        eRegisterNow = (TextView) findViewById(R.id.RegisterNowText);
        loginIn = true;

        eRegisterNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Login.this, Register.class);
                Login.this.startActivity(registerIntent);
            }
        });

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(loginIn){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setMessage("Login Failed")
                            .setNegativeButton("Retry", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    loginIn = false;
                                }
                            })
                            .create()
                            .show();
                } else {
                    Intent registerIntent = new Intent(Login.this, MainActivity.class);
                    Login.this.startActivity(registerIntent);
                }



            }
        });
    }


}