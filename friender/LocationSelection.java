package com.example.friender;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;




public class LocationSelection extends AppCompatActivity {
    public void onLocationClick(View v) {
        Intent myIntent = new Intent(getBaseContext(), MeetupGenerator.class);
        startActivity(myIntent);


    }
}
