package com.geeks.lesson_3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geeks.lesson_3_4.CONTINENT.ContinentFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentFragment()).commit();
    }
}