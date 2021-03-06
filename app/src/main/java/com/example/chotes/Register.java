package com.example.chotes;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;


public class Register extends AppCompatActivity {

    Button bRegister;
    EditText eUsername, ePassword, eName, eEducation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        eUsername = (EditText) findViewById(R.id.UsernameEdit);
        ePassword = (EditText) findViewById(R.id.repeatPassword);
        eName = (EditText) findViewById(R.id.NameEdit);
        eEducation = (EditText) findViewById(R.id.EducationEdit);
        bRegister = (Button) findViewById(R.id.registerButton);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Register.this);
                builder.setMessage("Registered")
                        .setNegativeButton("Back", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .create()
                        .show();


            }
        });
    }


}