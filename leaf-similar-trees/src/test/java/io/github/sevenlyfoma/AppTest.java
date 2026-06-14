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

        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(2);
        TreeNode tn4 = new TreeNode(1);

        TreeNode root1 = new TreeNode(3, tn1, tn2);

        TreeNode root2 = new TreeNode(3, tn3, tn4);

        assertEquals(false, App.leafSimilar(root1, root2));
    }

    @Test
    public void sampleTest2()
    {

        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(1);
        TreeNode tn4 = new TreeNode(2);
        TreeNode root1 = new TreeNode(3, tn1, tn2);

        TreeNode root2 = new TreeNode(3, tn3, tn4);

        assertEquals(true, App.leafSimilar(root1, root2));
    }


}
