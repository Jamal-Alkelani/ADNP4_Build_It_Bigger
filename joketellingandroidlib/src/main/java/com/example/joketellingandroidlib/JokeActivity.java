package com.example.joketellingandroidlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String JOKE="JOKE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent intent=getIntent();
        if(intent.hasExtra(JOKE)){
            TextView textView=findViewById(R.id.joke);
            textView.setText(intent.getStringExtra(JOKE));
        }
    }
}


