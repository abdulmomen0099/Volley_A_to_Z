package com.example.volleyatoz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class profileActivity extends AppCompatActivity {

    TextView name,phone,email,id;
    String nam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name= findViewById(R.id.editText_one);


        //setText(savedInstanceState.getString("name","dure giya mor"));

        SharedPreferences sharedPreferences = getSharedPreferences("userDetails", Context.MODE_PRIVATE);
        String g = savedInstanceState.getString("name","dure giya mor");


        sharedPreferences.edit().apply();


    }
}
