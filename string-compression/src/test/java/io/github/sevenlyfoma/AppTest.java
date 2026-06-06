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
    public void allSame()
    {
        assertEquals(2,App.compress("aaaa".toCharArray()));
    }

    @Test
    public void allSame2DigitsRunLength()
    {
        assertEquals(3,App.compress("aaaaaaaaaa".toCharArray()));
    }

    @Test
    public void oneLetter()
    {
        assertEquals(1,App.compress("a".toCharArray()));
    }

    @Test
    public void twoDifferent()
    {
        assertEquals(4,App.compress("aaaabb".toCharArray()));
    }

    @Test
    public void threeDifferent()
    {
        assertEquals(3,App.compress("abc".toCharArray()));
    }
}
