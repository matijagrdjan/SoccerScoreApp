package com.example.android.tennisscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    // Tracks the yellow cards for Team A
    int yellowTeamA = 0;

    // Tracks the yellow cards for Team B
    int yellowTeamB = 0;

    // Tracks the red cards for Team A
    int redTeamA = 0;

    // Tracks the red cards for Team B
    int redTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the yellow card for Team A by 1 .
     */
    public void addOneYellowForTeamA(View v) {
        yellowTeamA += 1;
        displayYellowForTeamA(yellowTeamA);
    }

    /**
     * Increase the Red card for Team A by 1 .
     */
    public void addOneRedForTeamA(View v) {
        redTeamA += 1;
        displayRedForTeamA(redTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the yellow card for Team B by 1 .
     */
    public void addOneYellowForTeamB(View v) {
        yellowTeamB += 1;
        displayYellowForTeamB(yellowTeamB);
    }

    /**
     * Increase the Red card for Team A by 1 .
     */
    public void addOneRedForTeamB(View v) {
        redTeamB += 1;
        displayRedForTeamB(redTeamB);
    }

    /**
     * Resets the score and cards for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayRedForTeamA(redTeamA);
        displayRedForTeamB(redTeamB);
        displayYellowForTeamA(yellowTeamA);
        displayYellowForTeamB(yellowTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red cards for Team A.
     */
    public void displayRedForTeamA(int red) {
        TextView scoreView = (TextView) findViewById(R.id.red_score_a);
        scoreView.setText(String.valueOf(red));
    }

    /**
     * Displays the given red cards for Team b.
     */
    public void displayRedForTeamB(int red) {
        TextView scoreView = (TextView) findViewById(R.id.red_score_b);
        scoreView.setText(String.valueOf(red));
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayYellowForTeamA(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_score_a);
        scoreView.setText(String.valueOf(yellow));
    }

    /**
     * Displays the given yellow cards for Team b.
     */
    public void displayYellowForTeamB(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_score_b);
        scoreView.setText(String.valueOf(yellow));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}

