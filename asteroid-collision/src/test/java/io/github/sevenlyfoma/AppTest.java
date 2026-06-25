package io.github.sevenlyfoma;

import static org.junit.Assert.assertArrayEquals;
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
        int[] inp = {5,10,-5};
        int[] exp = {5,10};
        assertArrayEquals(exp, App.asteroidCollision(inp));
    }

    @Test
    public void sampleTest2()
    {
        int[] inp = {8,-8};
        int[] exp = {};
        assertArrayEquals(exp, App.asteroidCollision(inp));
    }

    @Test
    public void sampleTest3()
    {
        int[] inp = {10,2,-5};
        int[] exp = {10};
        assertArrayEquals(exp, App.asteroidCollision(inp));
    }

    @Test
    public void sampleTest4()
    {
        int[] inp = {3,5,-6,2,-1,4};
        int[] exp = {-6,2,4};
        assertArrayEquals(exp, App.asteroidCollision(inp));
    }

    @Test
    public void sampleTest5()
    {
        int[] inp = {-2,-2,1,-2};
        int[] exp = {-2,-2,-2};
        assertArrayEquals(exp, App.asteroidCollision(inp));
    }
}
