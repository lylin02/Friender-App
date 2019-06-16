package com.example.friender;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MatchConfirmation extends AppCompatActivity {
    public void onMeetupClick(View v) {
        Intent myIntent = new Intent(getBaseContext(), LocationSelection.class);
        startActivity(myIntent);





        }
    }







