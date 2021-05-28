package com.example.chotes;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chotes.AccelerationPopup;
import com.example.chotes.R;

public class Comment extends AppCompatActivity {

    Button newComment;
    Button back;
    String s1[] = {"Jack Clearance", "Devonte Smith", "Josh Davis"};
    String s2[] = {"Really great notes, really helped me understand the basics before moving on to projectile motion."
            ,"This made physics easier. I cannot learn in class.", "Thanks, Now, I will get an A on my test."};
    int images[] = {R.drawable.profile2, R.drawable.profile3, R.drawable.profile4};

    RecyclerView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        view = findViewById(R.id.comments1);

        s1 = getResources().getStringArray(R.array.profiles);
        s2 = getResources().getStringArray(R.array.profile_comments);

        newComment = (Button) findViewById(R.id.add_comment);
        back = (Button) findViewById(R.id.back);


        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        view.setAdapter(myAdapter);
        view.setLayoutManager(new LinearLayoutManager(this));

        newComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Comment.this, NewComment.class);
                Comment.this.startActivity(registerIntent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Comment.this, AccelerationPopup.class);
                Comment.this.startActivity(registerIntent);
            }
        });

    }


}