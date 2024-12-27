package com.example.sltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Chat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }
//navigation chat ui and settings ui
    public void GoSettings(View view) {startActivity( new Intent(Chat.this,Settings.class));
}}