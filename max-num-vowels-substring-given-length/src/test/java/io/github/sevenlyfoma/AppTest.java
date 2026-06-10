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
    public void endOfWindowTest()
    {
        assertEquals(1, App.maxVowels("bbbbbi", 2));
    }

    @Test
    public void fullLengthWindowTest()
    {
        assertEquals(3, App.maxVowels("biiib", 3));
    }

    @Test
    public void moreThanLengthWindowTest()
    {
        assertEquals(3, App.maxVowels("biiiib", 3));
    }

    @Test
    public void lessThanLengthWindowTest()
    {
        assertEquals(2, App.maxVowels("biib", 3));
    }

    @Test
    public void oneManyNonConsecutiveTest()
    {
        assertEquals(1, App.maxVowels("ramadan", 2));
    }

    @Test
    public void nonConsecutiveBigWindow()
    {
        assertEquals(2, App.maxVowels("ramadan", 3));
    }

    

}
