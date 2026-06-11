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
    public void allOnes()
    {
        int[] inp = {1,1,1,1};
        assertEquals(4, App.longestOnes(inp, 2));
    }

    @Test
    public void oneZeroOneK()
    {
        int[] inp = {1,1,0,1};
        assertEquals(4, App.longestOnes(inp, 1));
    }

    @Test
    public void oneZeroNoK()
    {
        int[] inp = {1,1,0,1};
        assertEquals(2, App.longestOnes(inp, 0));
    }

    @Test
    public void twoZeroNoK()
    {
        int[] inp = {1,1,0,1};
        assertEquals(2, App.longestOnes(inp, 0));
    }

    @Test
    public void sampleTest1()
    {
        int[] inp = {1,1,1,0,0,0,1,1,1,1,0};
        assertEquals(6, App.longestOnes(inp, 2));
    }

    @Test
    public void sampleTest2()
    {
        int[] inp = {0,0,1,1,1,0,0};
        assertEquals(3, App.longestOnes(inp, 0));
    }
}
