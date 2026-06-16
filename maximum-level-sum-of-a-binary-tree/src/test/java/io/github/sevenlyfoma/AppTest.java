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

        Integer[] inp = {1,7,0,7,-8,null,null};

        root.buildTree(inp);


        assertEquals(2, App.maxLevelSum(root));


    }

    

    @Test
    public void sampleTest2()
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {989,null,10250,98693,-89388,null,null,null,-32127};

        root.buildTree(inp);


        assertEquals(2, App.maxLevelSum(root));


    }

    @Test
    public void sampleTest3()
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {-100,-200,-300,-20,-5,-10,null};

        root.buildTree(inp);


        assertEquals(3, App.maxLevelSum(root));


    }
}
