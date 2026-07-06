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
        int[] prices ={7,1,5,3,6,4};
        int expected = 7;

        assertEquals(expected, App.maxProfit(prices));
    }

    @Test
    public void sampleTest2()
    {
        int[] prices ={7,6,4,3,1};
        int expected = 0;

        assertEquals(expected, App.maxProfit(prices));
    }
}
