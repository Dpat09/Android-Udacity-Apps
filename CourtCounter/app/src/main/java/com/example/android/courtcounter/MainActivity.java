package com.example.android.courtcounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    /**
     * Variables used
     */
    int scoreTeamA = 0, scoreTeamB = 0, reset = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Displays score+3pts for Team A
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays score+2pts for Team A
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays score+1pts for Team A
     */
    public void addOneForTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays score+3pts for Team B
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays score+2pts for Team B
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays score+1pts for Team B
     */
    public void addOneForTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * resets all scores
     */
    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
