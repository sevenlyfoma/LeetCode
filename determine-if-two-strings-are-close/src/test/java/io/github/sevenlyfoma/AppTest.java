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
        assertEquals(true, App.closeStrings("abc", "bca"));
    }

    @Test
    public void sampleTest2()
    {
        assertEquals(false, App.closeStrings("a", "aa"));
    }

    @Test
    public void sampleTest3()
    {
        assertEquals(true, App.closeStrings("cabbba", "abbccc"));
    }
}
