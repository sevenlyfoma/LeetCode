package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TreeNode root = new TreeNode();

        Integer[] inp = {989,null,10250,98693,-89388,null,null,null,-32127};

        root.buildTree(inp);

        root.printTree(0);

    }

    public static TreeNode searchBST(TreeNode root, int val) {

        if (root == null || root.val == val){
            return root;
        }

        if (root.val > val){
            return searchBST(root.left, val);
        }
        else{
            return searchBST(root.right, val);
        }
    }


}
