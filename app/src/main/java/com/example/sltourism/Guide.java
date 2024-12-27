package com.example.sltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Guide extends AppCompatActivity {
//on create method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
    }
//navigate guid eui and chat ui
    public void GoChat(View view) {startActivity( new Intent(Guide.this,Chat.class));
}}