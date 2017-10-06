package com.example.gogos.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointforTeamA = 0;
    int pointForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA(View view) {
        pointforTeamA = pointforTeamA + 3;
        displayForTeamA(pointforTeamA);
    }

    public void addTwoForTeamA(View view) {
        pointforTeamA = pointforTeamA + 2;
        displayForTeamA(pointforTeamA);
    }

    public void addOneForTeamA(View view) {
        pointforTeamA = pointforTeamA + 1;
        displayForTeamA(pointforTeamA);
    }

    public void addThreeForTeamB(View view) {
        pointForTeamB = pointForTeamB + 3;
        displayForTeamB(pointForTeamB);
    }

    public void addTwoForTeamB(View view) {
        pointForTeamB = pointForTeamB + 2;
        displayForTeamB(pointForTeamB);
    }

    public void addOneForTeamB(View view) {
        pointForTeamB = pointForTeamB + 1;
        displayForTeamB(pointForTeamB);
    }

    public void resetForAll(View view) {
        pointforTeamA = 0;
        pointForTeamB = 0;
        displayForTeamA(pointforTeamA);
        displayForTeamB(pointForTeamB);
    }

    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_text_view);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_text_view);
        scoreView.setText(String.valueOf(score));
    }
}
