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
        int[] nums = {3,2,1,5,6,4};

        assertEquals(5, App.findKthLargest(nums, 2));
    }

     @Test
    public void sampleTest2()
    {
        int[] nums = {3,2,3,1,2,4,5,5,6};

        assertEquals(4, App.findKthLargest(nums, 4));
    }
}
