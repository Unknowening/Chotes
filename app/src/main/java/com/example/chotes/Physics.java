package com.example.chotes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Physics extends AppCompatActivity {

    Button bEnthalpy, bEntrophy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);

        bEnthalpy = (Button) findViewById(R.id.accelerationbutton);
        bEntrophy = (Button) findViewById(R.id.rotationbutton);

        bEnthalpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("slot", "Acceleration Notes Download");
                Library fragment = new Library();
                fragment.setArguments(bundle);
                System.out.println(bundle.getString("slot").toString());
                Intent intent = new Intent(Physics.this, MainActivity.class);
                intent.putExtra("slot", "Acceleration Notes Download");
                Physics.this.startActivity(intent);
            }
        });



    }
}