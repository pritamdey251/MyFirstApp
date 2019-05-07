package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Main Activity class to show string in app
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Show activity_main layout which holds the design to show strings
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
