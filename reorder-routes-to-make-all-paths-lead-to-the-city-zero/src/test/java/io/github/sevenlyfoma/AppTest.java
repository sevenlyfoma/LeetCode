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
        int[][] inp = {{0,1},{1,3},{2,3},{4,0},{4,5}};

        assertEquals(3, App.minReorder(6, inp));
    }

    @Test
    public void sampleTest2()
    {
        int[][] inp = {{1,0},{1,2},{3,2},{3,4}};

        assertEquals(2, App.minReorder(5, inp));
    }

    @Test
    public void sampleTest3()
    {
        int[][] inp = {{1,0},{2,0}};

        assertEquals(0, App.minReorder(2, inp));
    }

    @Test
    public void sampleTest4()
    {
        int[][] inp = {{4,3},{2,3},{1,2},{1,0}};

        assertEquals(2, App.minReorder(5, inp));
    }

    // @Test
    // public void circleTest()
    // {
    //     int[][] inp = {{0,1}, {1,2}, {2,3}, {3,4}, {0, 4}};

    //     assertEquals(1, App.minReorder(2, inp));
    // }
}
