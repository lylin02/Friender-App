package com.example.friender;



import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InterestSelector extends AppCompatActivity {
    public void onProfileClick(View v) {
        Intent myIntent = new Intent(getBaseContext(), MatchConfirmation.class);
        startActivity(myIntent);}
    }


/*
        int[] chck = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        boolean bool = true;
        String[] names = new String[] {"Art", "Business", "Theater", "Culinary", "Horror", "Music", "Mystery", "Science", "Sports", "Travel", "Activism/Civil Service", "Animals", "Literature" };

        String[] newArr = new String[5];
        // Is the view now checked?
        public void onCheckBoxClicked (View view) {
            boolean checked = view.isChecked();

            // Check which checkbox was clicked
            switch (view.getId()) {
                case R.id.Art:
                    if (checked)
                        chck[0] = 1;
                    else
                        chck[0] = 0;
                    break;
                case R.id.Business:
                    if (checked)
                        chck[1] = 1;
                    else
                        chck[1] = 0;
                case R.id.Theater:
                    if (checked)
                        chck[2] = 1;
                    else
                        chck[2] = 0;
                case R.id.Culinary:
                    if (checked)
                        chck[3] = 1;
                    else
                        chck[3] = 0;
                case R.id.Horror:
                    if (checked)
                        chck[4] = 1;
                    else
                        chck[4] = 0;
                case R.id.Music:
                    if (checked)
                        chck[5] = 1;
                    else
                        chck[5] = 0;
                case R.id.Mystery:
                    if (checked)
                        chck[6] = 1;
                    else
                        chck[6] = 0;
                case R.id.Science:
                    if (checked)
                        chck[7] = 1;
                    else
                        chck[7] = 0;
                case R.id.Sports:
                    if (checked)
                        chck[8] = 1;
                    else
                        chck[8] = 0;
                case R.id.Travel:
                    if (checked)
                        chck[9] = 1;
                    else
                        chck[9] = 0;
                case R.id.Activism:
                    if (checked)
                        chck[10] = 1;
                    else
                        chck[10] = 0;
                case R.id.Animals:
                    if (checked)
                        chck[11] = 1;
                    else
                        chck[11] = 0;
                case R.id.Literature:
                    if (checked)
                        chck[12] = 1;
                    else
                        chck[12] = 0;
            }
        }

        int countA = 0;
        for(int j = 0; j < 13; j++)
        {
            if (chck[j] == 1) {
                newArr[countA] = names[j];
                countA++;
            }


                String[] scA = new String[5]
                {
                        "Art", "Culinary", "Travel", "Music", "Sports"
                }
                ;
                int count = 0;

                for (int i = 0; i < 5) {
                        for (int k = 0; k < 5; k++) {
                                if (scA[i].equals(newArr[k])) {
                                        count++;
                                }
                        }
                }
                if (count >= 3) {
                        return true;
                }
        }
}
*/


