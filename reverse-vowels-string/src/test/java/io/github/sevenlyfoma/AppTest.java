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
    public void upperLowerTests()
    {
        assertEquals("AceCreIm", App.reverseVowels("IceCreAm"));
    }

    @Test
    public void simpleTest()
    {
        assertEquals("aBBe", App.reverseVowels("eBBa"));
    }

    @Test
    public void simpleTest2()
    {
        assertEquals("ABBE", App.reverseVowels("EBBA"));
    }

     @Test
    public void emptyTest()
    {
        assertEquals(" ", App.reverseVowels(" "));
    }

     @Test
    public void onevowel()
    {
        assertEquals("ab", App.reverseVowels("ab"));
    }

     @Test
    public void threletnoevowel()
    {
        assertEquals("bbb", App.reverseVowels("bbb"));
    }



    @Test
    public void testIsVowel()
    {
        assertEquals(true, App.isVowel('a'));
        assertEquals(true, App.isVowel('e'));
        assertEquals(true, App.isVowel('i'));
        assertEquals(true, App.isVowel('o'));
        assertEquals(true, App.isVowel('u'));
    }
}
