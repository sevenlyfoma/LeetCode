package io.github.sevenlyfoma;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;;
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
        int[] inp1 = {1,2,3};
        int[] inp2 = {2,4,6};

        Integer[][] expArr = new Integer[][] {{1,3}, {4,6}};
        
        List<List<Integer>> exp = Arrays.stream(expArr)
                               .map(Arrays::asList).collect(Collectors.toList());
                               
        List<List<Integer>> out = App.findDifference(inp1, inp2);
        
        assertTrue(out.equals(exp));
    }

    @Test
    public void sampleTest2()
    {
        int[] inp1 = {1,2,3,3};
        int[] inp2 = {1,1,2,2};

        Integer[][] expArr = new Integer[][] {{3}, {}};
        
        List<List<Integer>> exp = Arrays.stream(expArr)
                               .map(Arrays::asList).collect(Collectors.toList());
                               
        List<List<Integer>> out = App.findDifference(inp1, inp2);
        
        assertTrue(out.equals(exp));
    }
}
