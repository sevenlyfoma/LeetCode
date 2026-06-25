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
        assertEquals(4, App.tribonacci(4));
    }

    @Test
    public void sampleTest2()
    {
        assertEquals(1389537, App.tribonacci(25));
    }
}
