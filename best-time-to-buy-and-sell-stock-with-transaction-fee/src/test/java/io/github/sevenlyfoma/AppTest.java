package io.github.sevenlyfoma;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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
        int[] prices ={1,3,2,8,4,9};
        int fee = 2;
        int expected = 8;

        assertEquals(expected, App.maxProfit(prices, fee));
        assertTrue( true );
    }

    @Test
    public void sampleTest2()
    {
        int[] prices ={9,8,7,1,2};
        int fee = 3;
        int expected = 0;

        assertEquals(expected, App.maxProfit(prices, fee));
        assertTrue( true );
    }
}
