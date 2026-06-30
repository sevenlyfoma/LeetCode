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
        int[] nums = {1,1,2};
        int[] expectedNums = {1,2};

        int k = App.removeDuplicates(nums);

        assertEquals(k, expectedNums.length);
        for (int i = 0; i < k; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }
}
