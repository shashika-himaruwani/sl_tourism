package com.example.sltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Translate extends AppCompatActivity {
//on create method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
    }
//link two user interfaces translate and search
    public void GoSearch(View view) {startActivity(new Intent(Translate.this, Search.class));
}}