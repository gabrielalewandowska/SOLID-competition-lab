package com.example.user.solidcompetitionlab;

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/09/2017.
 */

public class AthleteTest {
    Athlete athlete1;
    ArrayList<Run> runs;
    Run run1;

    @Before
    public void before(){
        athlete1 = new Athlete("Steve");
        run1 = new Run(10000, 60 ,10, athlete1);
    }

    @Test
    public void canGetName(){
        assertEquals("Steve", athlete1.getName());
    }


    @Test
    public void runsStartEmpty(){
        assertEquals(0, athlete1.countRuns());
    }

    @Test
    public void canAddRun(){
        athlete1.addRun(run1);
        assertEquals(1, athlete1.countRuns());
    }

}
