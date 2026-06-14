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

        Integer[] inp = {1,null,2,null,3,null,4,null,5};

        root.buildTree(inp);

        root.printTree(0);

        System.out.println(pathSum(root, 3));
    }

    public static int pathSum(TreeNode root, int targetSum) {
        if (root == null) {return 0;}


        int count = 0;

        count += pathSumR(root, targetSum, 0);

        count += pathSum(root.left, targetSum);
        count += pathSum(root.right, targetSum);

        return count;
    }

    public static int pathSumR(TreeNode node, int targetSum, long runningSum){
        if (node == null) { return 0;}
        int count = 0;

        if (node.val + runningSum == targetSum){
            count ++;
        }

        count += pathSumR(node.left, targetSum, runningSum + node.val);
        count += pathSumR(node.right, targetSum, runningSum + node.val);

        return count;
    }
}
