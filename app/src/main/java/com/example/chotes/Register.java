package com.example.chotes;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Register extends AppCompatActivity {

    Button bRegister;
    EditText eUsername, ePassword, eName, eEducation;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        eUsername = (EditText) findViewById(R.id.UsernameEdit);
        ePassword = (EditText) findViewById(R.id.PasswordEdit);
        eName = (EditText) findViewById(R.id.NameEdit);
        eEducation = (EditText) findViewById(R.id.EducationEdit);
        bRegister = (Button) findViewById(R.id.LoginButton);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}