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
    public void test1()
    {
        int[] inp = {0,1,0,3,12};
        int[] exp = {1,3,12,0,0};

        App.moveZeroes(inp);

        assertArrayEquals(exp, inp);
    }

    @Test
    public void testOneZero()
    {
        int[] inp = {0};
        int[] exp = {0};

        App.moveZeroes(inp);

        assertArrayEquals(exp, inp);
    }
}
