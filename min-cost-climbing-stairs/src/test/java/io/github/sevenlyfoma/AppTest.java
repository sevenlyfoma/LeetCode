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
        int cost[] = {10,15,20};
        int expected = 15;


        assertEquals(expected, App.minCostClimbingStairs(cost));
    }

    @Test
    public void sampleTest2()
    {
        int cost[] = {1,100,1,1,1,100,1,1,100,1};
        int expected = 6;


        assertEquals(expected, App.minCostClimbingStairs(cost));
    }
}
