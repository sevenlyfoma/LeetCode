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
        int[] input = {2,3,1,1,4};

        assertEquals(2, App.jump(input));
    }

    @Test
    public void sampleTest2()
    {
        int[] input = {1,2};

        assertEquals(1, App.jump(input));
    }

    @Test
    public void sampleTest3()
    {
        int[] input = {2,1};

        assertEquals(1, App.jump(input));
    }

     @Test
    public void sampleTest4()
    {
        int[] input = {0};

        assertEquals(0, App.jump(input));
    }
}
