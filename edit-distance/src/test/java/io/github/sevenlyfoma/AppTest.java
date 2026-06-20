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
    public void sample1()
    {
        assertEquals(3, App.minDistance("horse", "ros"));
    }

    @Test
    public void sample2()
    {
        assertEquals(5, App.minDistance("intention", "execution"));
    }
}
