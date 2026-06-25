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
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        int expected = 1;

        assertEquals(expected, App.eraseOverlapIntervals(intervals));
    }

    @Test
    public void sampleTest2()
    {
        int[][] intervals = {{0,2},{1,3},{1,3},{2,4},{3,5},{3,5},{4,6}};
        int expected = 4;

        assertEquals(expected, App.eraseOverlapIntervals(intervals));
    }

    @Test
    public void sampleTest3()
    {
        int[][] intervals = {{1,100},{11,22},{1,11},{2,12}};
        int expected = 2;

        assertEquals(expected, App.eraseOverlapIntervals(intervals));
    }
}
