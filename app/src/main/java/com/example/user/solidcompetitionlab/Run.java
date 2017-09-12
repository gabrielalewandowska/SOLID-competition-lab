package com.example.user.solidcompetitionlab;

/**
 * Created by user on 12/09/2017.
 */

public class Run {

    int distance;
    int time;
    int altitudeGain;
    Athlete athlete;


    public Run(int distance, int time, int altitudeGain, Athlete athlete) {
        this.distance = distance;
        this.time = time;
        this.altitudeGain = altitudeGain;
        this.athlete = athlete;
    }

    public int getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }

    public int getAltitudeGain() {
        return altitudeGain;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public double getAverageSpeed() {
        return (this.distance / this.time);
    }

}
