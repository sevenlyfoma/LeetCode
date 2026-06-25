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
        int[] nums = {1,2,3,1};

        assertEquals(4, App.rob(nums));
    }

    @Test
    public void notAlternating()
    {
        int[] nums = {4,1,1,4};

        assertEquals(8, App.rob(nums));
    }
}
