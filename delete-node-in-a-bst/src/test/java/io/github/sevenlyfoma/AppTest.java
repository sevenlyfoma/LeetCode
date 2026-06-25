package io.github.sevenlyfoma;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testTreeEquals()
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {4,2,7,1,3};

        root.buildTree(inp);

        TreeNode rootExp = new TreeNode();

        Integer[] exp = {4,2,7,1,3};

        rootExp.buildTree(exp);

        assertEquals(rootExp, root);

    }


    @Test
    public void sampleTest1()
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {5,3,6,2,4,null,7};

        root.buildTree(inp);

        TreeNode rootExp = new TreeNode();

        Integer[] exp = {5,4,6,2,null,null,7};

        rootExp.buildTree(exp);

        

        assertEquals(rootExp, App.deleteNode(root, 3));

    }

    


    

    // @Test
    // public void sampleTest2()
    // {
    //     TreeNode root = new TreeNode();

    //     Integer[] inp = {4,2,7,1,3};

    //     root.buildTree(inp);

    //     assertEquals(null, App.searchBST(root, 5));

    // }

    // @Test
    // public void sampleTest3()
    // {
    //     TreeNode root = new TreeNode();

    //     Integer[] inp = {-100,-200,-300,-20,-5,-10,null};

    //     root.buildTree(inp);

    // }
}
