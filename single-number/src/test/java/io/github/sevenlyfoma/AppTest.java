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
        int nums[] = {2,2,1};
        int exp = 1;

        assertEquals(exp, App.singleNumber(nums));
    }

    @Test
    public void sampleTest2()
    {
        int nums[] = {4,1,2,1,2};
        int exp = 4;

        assertEquals(exp, App.singleNumber(nums));
    }

    @Test
    public void sampleTest3()
    {
        int nums[] = {1};
        int exp = 1;

        assertEquals(exp, App.singleNumber(nums));
    }
}
