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


public class Forget extends AppCompatActivity {

    Button bReset;
    EditText eUsername, ePassword, ePassword2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);

        eUsername = (EditText) findViewById(R.id.UsernameEdit);
        ePassword = (EditText) findViewById(R.id.newPasswordEdit);
        ePassword2 = (EditText) findViewById(R.id.repeatNewPassword);
        bReset = (Button) findViewById(R.id.resetButton);

        bReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Forget.this);
                builder.setMessage("Reset")
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