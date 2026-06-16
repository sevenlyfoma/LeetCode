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

        Integer[] inp = {3,5,1,6,2,0,8,null,null,7,4};

        root.buildTree(inp);

        TreeNode res = App.lowestCommonAncestor(root, root.left, root.right);

        assertEquals(root, res);

    }

    

    @Test
    public void sampleTest2()
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {3,5,1,6,2,0,8,null,null,7,4};

        root.buildTree(inp);

        TreeNode res = App.lowestCommonAncestor(root, root.left, root.left.right.right);

        assertEquals(root.left, res);

    }
}
