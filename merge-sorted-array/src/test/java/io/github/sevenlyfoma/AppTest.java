package io.github.sevenlyfoma;

import static org.junit.Assert.assertArrayEquals;
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
        int m = 3;
        int n = 3;

        int[] nums1 = {1, 2, 3, 0, 0, 0}; 
        int[] nums2 = {2, 5, 6};

        int[] expected = {1,2,2,3,5,6};

        App.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }
}
