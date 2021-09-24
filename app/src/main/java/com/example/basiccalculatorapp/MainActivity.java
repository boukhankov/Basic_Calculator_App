package com.example.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickAdd(View view) {
        EditText firstNum = (EditText) findViewById(R.id.textFirstNumber);
        EditText secondNum = (EditText) findViewById(R.id.textSecondNumber);
        int first = Integer.parseInt(firstNum.getText().toString());
        int second = Integer.parseInt(secondNum.getText().toString());

        goToActivity2(Integer.toString(first + second));


    }

    public void clickSub(View view) {
        EditText firstNum = (EditText) findViewById(R.id.textFirstNumber);
        EditText secondNum = (EditText) findViewById(R.id.textSecondNumber);
        int first = Integer.parseInt(firstNum.getText().toString());
        int second = Integer.parseInt(secondNum.getText().toString());

        goToActivity2(Integer.toString(first - second));
    }
    public void clickMtply(View view) {
        EditText firstNum = (EditText) findViewById(R.id.textFirstNumber);
        EditText secondNum = (EditText) findViewById(R.id.textSecondNumber);

        int first = Integer.parseInt(firstNum.getText().toString());
        int second = Integer.parseInt(secondNum.getText().toString());

        goToActivity2(Integer.toString(first * second));
    }
    public void clickDiv(View view) {
        EditText firstNum = (EditText) findViewById(R.id.textFirstNumber);
        EditText secondNum = (EditText) findViewById(R.id.textSecondNumber);
        int first = Integer.parseInt(firstNum.getText().toString());
        int second = Integer.parseInt(secondNum.getText().toString());

        goToActivity2(Integer.toString(first / second));



    }

    public void goToActivity2(String ans){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", ans);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}