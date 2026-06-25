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
        int a = 2;
        int b = 6;
        int c = 5;

        int flips = 3;

        assertEquals(flips, App.minFlips(a, b, c));
    }

    @Test
    public void sampleTest2()
    {
        int a = 8;
        int b = 3;
        int c = 5;

        int flips = 3;

        assertEquals(flips, App.minFlips(a, b, c));
    }
}
