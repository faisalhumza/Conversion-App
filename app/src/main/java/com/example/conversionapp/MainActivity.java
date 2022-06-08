package com.example.conversionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title;
    TextView auth;
    TextView category;
    EditText category1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView) findViewById(R.id.title);
        auth = (TextView) findViewById(R.id.auth);
        category = (TextView) findViewById(R.id.category);
        category1 = (EditText) findViewById(R.id.category1);
    }
}