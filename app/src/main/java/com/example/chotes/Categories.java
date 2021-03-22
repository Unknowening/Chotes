package com.example.chotes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Categories extends AppCompatActivity {

    private Button bPhysics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagories);

        bPhysics = (Button) findViewById(R.id.buttonPhysics);

        bPhysics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Categories.this, Physics.class);
                Categories.this.startActivity(intent);
            }
        });

    }
}