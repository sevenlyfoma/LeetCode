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
        int[][] grid ={{2,1,1},{1,1,0},{0,1,1}};
        assertEquals(4, App.orangesRotting(grid));
    }

    @Test
    public void sampleTest2()
    {
        int[][] grid ={{2,1,1},{0,1,1},{1,0,1}};
        assertEquals(-1, App.orangesRotting(grid));
    }

    @Test
    public void sampleTest3()
    {
        int[][] grid ={{0,2}};
        assertEquals(0, App.orangesRotting(grid));
    }

    @Test
    public void sampleTest4()
    {
        int[][] grid ={{2,1,1},{1,1,1},{0,1,2}};
        assertEquals(2, App.orangesRotting(grid));
    }
}
