package io.github.sevenlyfoma;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
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
        TreeNode root = new TreeNode();

        Integer[] inp = {1,2,3,null,5,null,4};

        root.buildTree(inp);

        List<Integer> exp = Arrays.asList(1,3,4);

        assertEquals(exp, App.rightSideView(root));


    }

    

    @Test
    public void sampleTest2()
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {1,2,3,4,null,null,null,5};

        root.buildTree(inp);

        List<Integer> exp = Arrays.asList(1,3,4,5);

        assertEquals(exp, App.rightSideView(root));
    }
}
