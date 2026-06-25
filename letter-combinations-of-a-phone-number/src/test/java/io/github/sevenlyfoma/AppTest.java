package io.github.sevenlyfoma;

import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void sampleTest1()
    {
        String input = "2";
        List<String> output = List.of("a", "b", "c");

        assertEquals(output, App.letterCombinations(input));
    }

    @Test
    public void sampleTest2()
    {
        String input = "23";
        List<String> output = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");

        assertEquals(output, App.letterCombinations(input));
    }
}
