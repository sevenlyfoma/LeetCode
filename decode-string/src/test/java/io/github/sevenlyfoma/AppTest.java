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
        assertEquals("aaabcbc", App.decodeString("3[a]2[bc]"));
    }

     @Test
    public void sampleTest2()
    {
        assertEquals("accaccacc", App.decodeString("3[a2[c]]"));
    }

     @Test
    public void sampleTest3()
    {
        assertEquals("abcabccdcdcdef", App.decodeString("2[abc]3[cd]ef"));
    }

    
     @Test
    public void sampleTest4()
    {
        assertEquals("abccdcdcdxyz", App.decodeString("abc3[cd]xyz"));
    }
}
