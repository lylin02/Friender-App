package com.example.friender;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Scanner;


public class AccountLogin extends AppCompatActivity {


    public static void main(String[] args) {

        String Username1;
        String PasswordUser1;
        String Username2;
        String PasswordUser2;

        PasswordUser1 = "123";
        Username1 = "User1";
        PasswordUser2 = "123";
        Username2 = "User2";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();

        if (username.equals(Username1) && password.equals(PasswordUser1)) {

            System.out.println("Access Granted! Welcome!");
        } else if (username.equals(Username2) && password.equals(PasswordUser2)) {

            System.out.println("Access Granted! Welcome!");
        } else if (username.equals(Username2)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(PasswordUser2)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }

    }

    public void OnLoginClick(View v) {
        Intent myIntent = new Intent(getBaseContext(), AccountLogin.class);
        startActivity(myIntent);

    }

    public void onAccSubmitClick(View v) {
        Intent myIntent = new Intent(getBaseContext(), InterestSelector.class);
        startActivity(myIntent);
    }
}

