package io.github.sevenlyfoma;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void sampleTest1()
    {
        int[][] input = {{10,16},{2,8},{1,6},{7,12}};

        assertEquals(2, App.findMinArrowShots(input));
    }

    @Test
    public void sampleTest2()
    {
        int[][] input = {{1,2},{3,4},{5,6},{7,8}};

        assertEquals(4, App.findMinArrowShots(input));
    }


    @Test
    public void sampleTest3()
    {
        int[][] input = {{1,2},{2,3},{3,4},{4,5}};

        assertEquals(2, App.findMinArrowShots(input));
    }
}
