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
        int[] inp = {1,7,3,6,5,6};
        assertEquals(3, App.pivotIndex(inp));
    }

    @Test
    public void multiplePivots()
    {
        int[] inp = {0,0,0,0,0,0};
        assertEquals(0, App.pivotIndex(inp));
    }

    @Test
    public void manyNegatives()
    {
        int[] inp = {-1,-1,-1,-1,-1,0};
        assertEquals(2, App.pivotIndex(inp));
    }
}
