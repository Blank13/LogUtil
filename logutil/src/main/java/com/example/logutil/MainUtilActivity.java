package com.example.logutil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainUtilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umain);
        new LogDebug().d("HHHHH");
    }
}
