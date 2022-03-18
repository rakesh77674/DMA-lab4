package com.example.homeworklab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    public static final String EXTRA_MESSAGE = "message";
    private Button Hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        Hello = findViewById(R.id.button_toast);
    }


    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void launchsecondActivity(View view) {
        Intent i = new Intent(this, SecondActivity.class);
        String passedMessage = mShowCount.getText().toString();
        i.putExtra(EXTRA_MESSAGE, passedMessage);
        startActivity(i);

    }
}