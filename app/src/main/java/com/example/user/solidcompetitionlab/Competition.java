package com.example.user.solidcompetitionlab;

import java.util.ArrayList;

/**
 * Created by user on 12/09/2017.
 */

public class Competition {

    ArrayList<Run> runs;

    public Competition() {
        this.runs = new ArrayList<>();
    }


    public void addRun(Run run){
        runs.add(run);
    }


    public Athlete showWinnerInLongestDistance() {
        Athlete winner = null;
        int winningRun = 0;
        for (Run run : runs) {
            if (run.getDistance() > winningRun){
                winningRun = run.getDistance();
                winner = run.getAthlete();
            }
        }
        return winner;
    }

    public Athlete showWinnerInAverageSpeed() {
        Athlete winner = null;
        double winningRun = 0;
        for (Run run : runs) {
            if (run.getAverageSpeed() > winningRun){
                winningRun = run.getAverageSpeed();
                winner = run.getAthlete();
            }
        }
        return winner;
    }

    public Athlete showWinnerInAltitudeGained() {
        Athlete winner = null;
        int winningRun = 0;
        for (Run run : runs) {
            if (run.getAltitudeGain() > winningRun){
                winningRun = run.getAltitudeGain();
                winner = run.getAthlete();
            }
        }
        return winner;
    }


}
