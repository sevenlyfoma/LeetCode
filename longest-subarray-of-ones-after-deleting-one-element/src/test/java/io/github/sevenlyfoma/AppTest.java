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
        int[] inp = {1,1,1};
        assertEquals(2, App.longestSubarray(inp));
    }

    @Test
    public void oneZeroNonBlocking()
    {
        int[] inp = {1,1,1,0};
        assertEquals(3, App.longestSubarray(inp));
    }

    @Test
    public void oneZeroBlocking()
    {
        int[] inp = {1,1,0,1};
        assertEquals(3, App.longestSubarray(inp));
    }

    @Test
    public void twoZeroTrueBlocking()
    {
        int[] inp = {1,1,0,0,1};
        assertEquals(2, App.longestSubarray(inp));
    }

    @Test
    public void gapTest()
    {
        int[] inp = {1,1,0,0,1,1,1,1};
        assertEquals(4, App.longestSubarray(inp));
    }

    

    @Test
    public void middleBig()
    {
        int[] inp = {0,1,1,1,0,1,1,0,1};
        assertEquals(5, App.longestSubarray(inp));
    }

    @Test
    public void allZeros()
    {
        int[] inp = {0,0,0,0,0};
        assertEquals(0, App.longestSubarray(inp));
    }
}
