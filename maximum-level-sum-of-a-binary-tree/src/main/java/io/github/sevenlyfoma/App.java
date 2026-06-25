package io.github.sevenlyfoma;

import java.util.ArrayDeque;

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

        System.out.println(maxLevelSum(root));

    }

    public static int maxLevelSum(TreeNode root) {
        if (root == null){
            return 0;
        }
        long maxSum = Long.MIN_VALUE;
        int maxSumLevel = 0;

        ArrayDeque<TreeNode> bfsQueue = new ArrayDeque<>();

        bfsQueue.add(root);

        int numberAtThisLevel = 1;
        int numberAtNextLevel = 0;

        long currentSum = 0;
        int currentSumLevel = 1;

        while (!bfsQueue.isEmpty()){ 

            TreeNode current = bfsQueue.poll();

            if (current.left != null){
                bfsQueue.add(current.left);
                numberAtNextLevel++;
            }
            if (current.right != null){
                bfsQueue.add(current.right);
                numberAtNextLevel++;
            }

            numberAtThisLevel--;
            currentSum += current.val;


            if (numberAtThisLevel == 0){

                if (currentSum > maxSum){
                    maxSum = currentSum;
                    maxSumLevel = currentSumLevel;
                }
                currentSum = 0;
                currentSumLevel++;
                numberAtThisLevel = numberAtNextLevel;
                numberAtNextLevel = 0;
            }
            
        }
        return maxSumLevel;
    }

}
