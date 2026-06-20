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
        int[] exp = {0,1,1};
        assertArrayEquals(exp, App.countBits(2));
    }

    @Test
    public void sampleTest2()
    {
        int[] exp = {0,1,1,2,1,2};
        assertArrayEquals(exp, App.countBits(5));
    }

    @Test
    public void sampleTest3()
    {
        int[] exp = {0};
        assertArrayEquals(exp, App.countBits(0));
    }

    @Test
    public void sampleTest4()
    {
        int[] exp = {0,1,1,2,1,2,2,3,1};
        assertArrayEquals(exp, App.countBits(8));
    }
}
