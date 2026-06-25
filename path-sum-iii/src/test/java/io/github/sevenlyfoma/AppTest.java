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

        Integer[] inp = {10,5,-3,3,2,null,11,3,-2,null,1};

        root.buildTree(inp);

        assertEquals(3, App.pathSum(root, 8));

    }

    @Test
    public void sampleTest2()
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {5,4,8,11,null,13,4,7,2,null,null,5,1};

        root.buildTree(inp);

        assertEquals(3, App.pathSum(root, 22));

    }

    @Test
    public void sampleTest3()
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {1,null,2,null,3,null,4,null,5};

        root.buildTree(inp);

        assertEquals(2, App.pathSum(root, 3));

    }

    @Test
    public void sampleTest4()
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000,null};

        root.buildTree(inp);

        assertEquals(0, App.pathSum(root, 0));

    }

}
