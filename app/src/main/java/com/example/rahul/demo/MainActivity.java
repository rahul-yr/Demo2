package com.example.rahul.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UtilityClass utility = new UtilityClass();
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        TextView tv = findViewById(R.id.myTextView);
        tv.setText("HELLO >> HALLO");
        
    }
}
