package com.example.android.pottytraining;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int momScore = 0;
    int dadScore = 0;

    TextView mom_score;
    TextView dad_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mom_score = findViewById(R.id.mom_score);
        dad_score = findViewById(R.id.dad_score);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreA", momScore);
        outState.putInt("scoreB", dadScore);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        momScore = savedInstanceState.getInt("scoreA");
        dadScore = savedInstanceState.getInt("scoreB");
        displayForMom(momScore);
        displayForDad(dadScore);
    }

    /**
     * Adds 1 point for Mom.
     */

    public void addOneWetMom(View v) {
        momScore = momScore + 1;
        displayForMom(momScore);
    }

    /**
     * Adds 2 points for Mom.
     */

    public void addTwoBmMom(View v) {
        momScore = momScore + 2;
        displayForMom(momScore);
    }

    /**
     * Loses 1 point for Mom.
     */

    public void loseOneMom(View v) {
        momScore = momScore - 1;
        displayForMom(momScore);
    }

    /**
     * Adds 1 point for Dad.
     */

    public void addOneWetDad(View v) {
        dadScore = dadScore + 1;
        displayForDad(dadScore);
    }

    /**
     * Adds 2 points for Dad.
     */

    public void addTwoBmDad(View v) {
        dadScore = dadScore + 2;
        displayForDad(dadScore);
    }

    /**
     * Loses 1 point for Dad.
     */

    public void loseOneDad(View v) {
        dadScore = dadScore - 1;
        displayForDad(dadScore);
    }

    /**
     * Reset both scores to 0.
     */

    public void resetScore(View v) {
        momScore = 0;
        dadScore = 0;
        displayForMom(momScore);
        displayForDad(dadScore);
    }

    /**
     * Displays the given score for Mom.
     */

    public void displayForMom(int score) {
        mom_score.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Dad.
     */

    public void displayForDad(int score) {
        dad_score.setText(String.valueOf(score));
    }

}
