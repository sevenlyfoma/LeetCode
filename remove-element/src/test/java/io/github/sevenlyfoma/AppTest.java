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
    public void shouldAnswerWithTrue()
    {
        int[] nums = {3,2,2,3};
        int val = 3;


        assertEquals(2, App.removeElement(nums, val));
        assertEquals(2, nums[0]);
        assertEquals(2, nums[1]);
    }
}
