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
        int[] temperatures = {73,74,75,71,69,72,76,7};
        int[] out = {1,1,4,2,1,1,0,0};

        assertArrayEquals(out, App.dailyTemperatures(temperatures));
    }
}
