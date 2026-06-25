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
    public void smallestContainer()
    {
        int[] inp = {1,1};
        assertEquals(1, App.maxArea(inp));
    }

    @Test
    public void sampletest()
    {
        int[] inp = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, App.maxArea(inp));
    }


    @Test
    public void lTest()
    {
        int[] inp = {10, 1, 1, 1, 300, 10};
        assertEquals(50, App.maxArea(inp));
    }

    @Test
    public void rTest()
    {
        int[] inp = {10, 300, 1, 1, 1, 10};
        assertEquals(50, App.maxArea(inp));
    }
}
