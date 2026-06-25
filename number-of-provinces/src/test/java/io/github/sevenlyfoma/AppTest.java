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
        int[][] inp = {{1,1,0},{1,1,0},{0,0,1}};

        assertEquals(2, App.findCircleNum(inp));
    }

    @Test
    public void sampleTest2()
    {
        int[][] inp = {{1,0,0},{0,1,0},{0,0,1}};

        assertEquals(3, App.findCircleNum(inp));
    }

    //[1,0,0,1],[0,1,1,0],[0,1,1,1],[1,0,1,1]

    @Test
    public void sampleTest3()
    {
        int[][] inp = {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};

        assertEquals(1, App.findCircleNum(inp));
    }

}
