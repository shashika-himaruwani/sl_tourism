package com.example.sltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Facilities extends AppCompatActivity {
//on create method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);
    }
//navigation facilities ui and plan ui
    public void GoPlan(View view) {startActivity( new Intent(Facilities.this,Plan.class));
}}