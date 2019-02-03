package com.benoi.alex.basketballscorecounter.feature;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays a score counter for a basketball match.
 */
public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayA(0);
        displayB(0);
    }

    /**
     * This method is called when the pointer3A button is clicked.
     */
    public void pointer3A(View view) {
        scoreA = scoreA+3;
        displayA(scoreA);
    }

    /**
     * This method is called when the pointer2A button is clicked.
     */
    public void pointer2A(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }

    /**
     * This method is called when the pointer1A button is clicked.
     */
    public void pointer1A(View view) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }

    /**
     * This method is called when the pointer3B button is clicked.
     */
    public void pointer3B(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    /**
     * This method is called when the pointer2B button is clicked.
     */
    public void pointer2B(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    /**
     * This method is called when the pointer1B button is clicked.
     */
    public void pointer1B(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }

    /**
     * This method is called when the reset button is clicked.
     */
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }

    /**
     * This method displays the team a score on the screen.
     */
    private void displayA(int number) {
        TextView teamAscore = (TextView) findViewById(R.id.team_a_score);
        teamAscore.setText(String.valueOf(scoreA));
    }

    /**
     * This method displays the team b score on the screen.
     */
    private void displayB(int number) {
        TextView teamBscore = (TextView) findViewById(R.id.team_b_score);
        teamBscore.setText(String.valueOf(scoreB));
    }
}