package io.github.sevenlyfoma;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals(true, App.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void shouldAnswerWithFalse()
    {
        assertEquals(false, App.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void checkWorksForEmpty()
    {
        assertEquals(true, App.isSubsequence("", "ahbgdc"));
    }

}
