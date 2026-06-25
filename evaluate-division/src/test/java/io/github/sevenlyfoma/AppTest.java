package io.github.sevenlyfoma;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
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
    public void sampleTest1()
    {
        List<List<String>> equations = List.of(List.of("a","b"), List.of("b","c"));
        double[] values = {2.0, 3.0};
        List<List<String>> queries = List.of(List.of("a", "c"));

        double[] output = {6.0};
        
        assertArrayEquals(output, App.calcEquation(equations, values, queries), 0.01);
    }
}
