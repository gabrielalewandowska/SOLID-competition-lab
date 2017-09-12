package com.example.user.solidcompetitionlab;

import java.util.ArrayList;

/**
 * Created by user on 12/09/2017.
 */

class Athlete {
    ArrayList<Run> runs;
    String name;


    public Athlete(String name) {
        this.name = name;
        this.runs = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public int countRuns() {
        return this.runs.size();
    }


    public void addRun(Run run) {
        this.runs.add(run);
    }
}
