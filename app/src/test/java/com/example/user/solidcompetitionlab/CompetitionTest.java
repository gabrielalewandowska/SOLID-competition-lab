package com.example.user.solidcompetitionlab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/09/2017.
 */

public class CompetitionTest {
    Competition competition1;
    Run run1;
    Run run2;
    Athlete athlete1;
    Athlete athlete2;

    @Before
    public void before(){
        competition1 = new Competition();
        athlete1 = new Athlete("Steve");
        athlete2 = new Athlete("Fred");
        run1 = new Run(5000, 50, 20, athlete1);
        run2 = new Run(6000, 70, 15, athlete2);
    }

    @Test
    public void canAddRun(){
        competition1.addRun(run1);
        assertEquals(1, competition1.runs.size());
    }
    @Test
    public void canShowWinnerInLongestDistance(){
        competition1.addRun(run1);
        competition1.addRun(run2);
        assertEquals(athlete2, competition1.showWinnerInLongestDistance());
    }

    @Test
    public void canShowWinnerInAverageSpeed(){
        competition1.addRun(run1);
        competition1.addRun(run2);
        assertEquals(athlete1, competition1.showWinnerInAverageSpeed());
    }

    @Test
    public void canShowWinnerInAltitudeGain(){
        competition1.addRun(run1);
        competition1.addRun(run2);
        assertEquals(athlete1, competition1.showWinnerInAltitudeGained());
    }




}
