package com.example.friender;

import androidx.appcompat.app.AppCompatActivity;


import java.util.Scanner;

public class MeetupGenerator extends AppCompatActivity {

    public static void main(String[] args) {

        String Response1;


        Response1 = "good";


        Scanner input1 = new Scanner(System.in);
        String feedback= input1.next();
        {
            if (feedback.equals(Response1)) {
                System.out.println("Great! Thank you!");

            } else
                    System.out.println("Sorry! We will work on it!");
                }
            }

        }


