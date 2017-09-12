package com.example.user.solidcompetitionlab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/09/2017.
 */

public class RunTest {
    Run run1;
    Athlete athlete1;

    @Before
    public void before(){
        athlete1 = new Athlete("Steve");
        run1 = new Run(5000, 40, 25, athlete1);
    }

    @Test
    public void canGetDistance(){
        assertEquals(5000, run1.getDistance());
    }

    @Test
    public void canGetTime(){
        assertEquals(40, run1.getTime());
    }

    @Test
    public void canGetAltitudeGain(){
        assertEquals(25, run1.getAltitudeGain());
    }

    @Test
    public void canGetAverageSpeed() {
        assertEquals(125, run1.getAverageSpeed(), 0.01);
    }
}
