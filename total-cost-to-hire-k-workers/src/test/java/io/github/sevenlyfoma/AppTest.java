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
        int[] inp = {17,12,10,2,7,2,11,20,8};
        assertEquals(11, App.totalCost(inp, 3, 4));
    }
    
    @Test
    public void checkLeftBias()
    {
        int[] inp = {2,2,2,2,2,2,1,4,5,5,5,5,5,2,2,2,2,2,2,2,2,2,2,2,2,2};
        assertEquals(13, App.totalCost(inp, 7, 3));
    }

    @Test
    public void leftRunsOut()
    {
        int[] inp = {1,2,4,1};
        assertEquals(4, App.totalCost(inp, 3,3));
    }
    
}
