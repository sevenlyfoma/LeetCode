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

        Integer[] inp = {4,2,7,1,3};

        root.buildTree(inp);

        assertEquals(root.left, App.searchBST(root, 2));

    }

    

    @Test
    public void sampleTest2()
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {4,2,7,1,3};

        root.buildTree(inp);

        assertEquals(null, App.searchBST(root, 5));

    }

    // @Test
    // public void sampleTest3()
    // {
    //     TreeNode root = new TreeNode();

    //     Integer[] inp = {-100,-200,-300,-20,-5,-10,null};

    //     root.buildTree(inp);

    // }
}
