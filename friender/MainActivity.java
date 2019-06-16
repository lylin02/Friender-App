package com.example.friender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnLoginClick(View v) {
            Intent myIntent = new Intent(getBaseContext(), AccountLogin.class);
            startActivity(myIntent);
    }

    public void onAccSubmitClick(View v) {
        Intent myIntent = new Intent(getBaseContext(), InterestSelector.class);
        startActivity(myIntent);
    }

    public void onProfileClick(View v) {
        Intent myIntent = new Intent(getBaseContext(), MatchConfirmation.class);
        startActivity(myIntent);
    }

    public void onMeetupClick(View v) {
        Intent myIntent = new Intent(getBaseContext(), LocationSelection.class);
        startActivity(myIntent);
    }

    public void onLocationClick(View v) {
        Intent myIntent = new Intent(getBaseContext(), MeetupGenerator.class);
        startActivity(myIntent);
    }
}

