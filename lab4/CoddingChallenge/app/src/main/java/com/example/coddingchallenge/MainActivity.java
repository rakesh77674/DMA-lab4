package com.example.coddingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.codingchallenge";
    Button buttonOne, buttonTwo, buttonThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne = findViewById(R.id.button_label_one);
        buttonTwo = findViewById(R.id.button_label_two);
        buttonThree = findViewById(R.id.button_label_three);
    }

    public void ShowButtonOne(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = buttonOne.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void ShowButtonTwo(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = buttonTwo.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void ShowbuttonThree(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = buttonThree.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}