package io.github.sevenlyfoma;

import static org.junit.Assert.assertArrayEquals;
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
    public void allZeros()
    {
        int[] exp = {0, 0, 0, 0, 0};

        int[] inp = {0, 0, 0, 0, 0};

        assertArrayEquals(exp, App.productExceptSelf(inp));
    }

    @Test
    public void twoZeros()
    {
        int[] exp = {0, 0, 0, 0, 0};

        int[] inp = {1, 2, 3, 0, 0};

        assertArrayEquals(exp, App.productExceptSelf(inp));
    }

    @Test
    public void oneZero()
    {
        int[] exp = {0, 0, 0, 0, 24};

        int[] inp = {1, 2, 3, 4, 0};

        assertArrayEquals(exp, App.productExceptSelf(inp));
    }

    @Test
    public void noZeros()
    {
        int[] exp = {120, 60, 40, 30, 24};

        int[] inp = {1, 2, 3, 4, 5};

        assertArrayEquals(exp, App.productExceptSelf(inp));
    }
    
}
