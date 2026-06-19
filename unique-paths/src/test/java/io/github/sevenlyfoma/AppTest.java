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
        int m = 3;
        int n = 7;
        int expected = 28;
        assertEquals(expected, App.uniquePaths(m, n));
    }
}
