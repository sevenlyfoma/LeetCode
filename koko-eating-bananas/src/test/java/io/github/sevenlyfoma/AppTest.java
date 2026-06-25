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
        int[] piles = {3,6,7,11};
        int h = 8;
        int expected = 4;

        assertEquals(expected, App.minEatingSpeed(piles, h));
    }

    @Test
    public void sampleTest2()
    {
        int[] piles = {1,2,3,4,5};
        int h = 9;
        int expected = 2;

        assertEquals(expected, App.minEatingSpeed(piles, h));
    }

    @Test
    public void sampleTest3()
    {
        int[] piles = {1,2,3,4,5};
        int h = 14;
        int expected = 2; 

        assertEquals(expected, App.minEatingSpeed(piles, h));
    }

    @Test
    public void sampleTest4()
    {
        int[] piles = {1,2,3,4,5};
        int h = 15;
        int expected = 1;

        assertEquals(expected, App.minEatingSpeed(piles, h));
    }


    @Test
    public void sampleTest5()
    {
        int[] piles = {3};
        int h = 3;
        int expected = 1;

        assertEquals(expected, App.minEatingSpeed(piles, h));
    }
}
