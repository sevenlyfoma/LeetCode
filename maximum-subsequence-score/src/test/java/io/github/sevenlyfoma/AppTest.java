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
    public void sampleTest1(){
        int[] nums1 = {1,3,3,2};
        int[] nums2 = {2,1,3,4};

        assertEquals(12l, App.maxScore(nums1, nums2, 3));
    }

    @Test
    public void sampleTest2(){
        int[] nums1 = {1,1,1,80,80,80};
        int[] nums2 = {80000,80000,80000,1,1,1};

        assertEquals(3*80000, App.maxScore(nums1, nums2, 3));
    }
}
