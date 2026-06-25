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

        Integer[] inp = {3,1,4,3,null,1,5};

        root.buildTree(inp);


        assertEquals(4, App.goodNodes(root));
    }

    @Test
    public void sampleTest2()
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {3,3,null,4,2};

        root.buildTree(inp);


        assertEquals(3, App.goodNodes(root));
    }

    @Test
    public void sampleTest3()
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {1};

        root.buildTree(inp);


        assertEquals(1, App.goodNodes(root));
    }


}
