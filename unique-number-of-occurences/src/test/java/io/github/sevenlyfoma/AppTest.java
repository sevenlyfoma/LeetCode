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
        int[] inp = {1,2,2,1,1,3};
        assertEquals(true, App.uniqueOccurrences(inp));
    }
    
    @Test
    public void sampleTest2()
    {
        int[] inp = {1,2};
        assertEquals(false, App.uniqueOccurrences(inp));
    }

    @Test
    public void sampleTest3()
    {
        int[] inp = {-3,0,1,-3,1,1,1,-3,10,0};
        assertEquals(true, App.uniqueOccurrences(inp));
    }
}
