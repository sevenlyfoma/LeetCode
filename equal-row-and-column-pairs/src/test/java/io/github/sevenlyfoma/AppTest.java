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
        int[][] inp = {{3,2,1},{1,7,6},{2,7,7}};
        assertEquals(1, App.equalPairs(inp));
    }

    
    @Test
    public void sampleTest2()
    {
        int[][] inp = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        assertEquals(3, App.equalPairs(inp));
    }
}
