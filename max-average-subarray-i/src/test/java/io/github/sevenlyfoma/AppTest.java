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
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void sampleTest1()
    {
        int[] nums = {1,12,-5,-6,50,3};
        assertEquals(12.75d, App.findMaxAverage(nums, 4), 0.00001);
    }

    @Test
    public void sampleTest2()
    {
        int[] nums = {-1};
        assertEquals(-1, App.findMaxAverage(nums, 1), 0.00001);
    }
}
