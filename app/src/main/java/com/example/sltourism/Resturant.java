package com.example.sltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//restaurant extend
public class Resturant extends AppCompatActivity {
//on create method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant);
    }
//link two interfaces restaurant and facilities
    public void GoFacilities(View view) {startActivity( new Intent(Resturant.this,Facilities.class));
}}