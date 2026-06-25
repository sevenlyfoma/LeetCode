package io.github.sevenlyfoma;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void sampleTest1()
    {
        int[] inp = {-5,1,5,0,-7};
        assertEquals(1, App.largestAltitude(inp));
    }

    @Test
    public void sampleTest2()
    {
        int[] inp = {-4,-3,-2,-1,4,3,2};
        assertEquals(0, App.largestAltitude(inp));
    }

}
