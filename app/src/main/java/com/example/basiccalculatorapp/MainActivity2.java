package com.example.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textViewAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewAns = (TextView) findViewById(R.id.textViewAns);
        Intent intent = getIntent();
        String ans = intent.getStringExtra("message");
        textViewAns.setText(ans);
    }
}