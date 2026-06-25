package io.github.sevenlyfoma;

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

        Integer[] inp = {1,null,1,1,1,null,null,1,1,null,1,null,null,null,1};

        root.buildTree(inp);

        assertEquals(3, App.longestZigZag(root));

    }

    

    @Test
    public void sampleTest2()
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {1,1,1,null,1,null,null,1,1,null,1};

        root.buildTree(inp);

        assertEquals(4, App.longestZigZag(root));

    }
}
