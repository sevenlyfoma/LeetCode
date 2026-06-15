package io.github.sevenlyfoma;

import java.util.HashMap;

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
        // if (root == null) {return 0;}

        HashMap<Long, Integer> tracker = new HashMap<>();

        tracker.put(0l,1);

        
        return pathSumRecursiveHashMap(root, targetSum, tracker, 0);
    }

    public static int pathSumRecursiveHashMap(TreeNode node, int targetSum, HashMap<Long, Integer> tracker, long runningSum) {
        if (node == null) {return 0;}

        runningSum += node.val;

        int res = tracker.getOrDefault(runningSum-targetSum, 0);

        tracker.put(runningSum, tracker.getOrDefault(runningSum, 0) + 1);

        res += pathSumRecursiveHashMap(node.left, targetSum, tracker, runningSum);
        res += pathSumRecursiveHashMap(node.right, targetSum, tracker, runningSum);

                
        
        tracker.put(runningSum, tracker.get(runningSum) - 1);
        
        return res;
    }

    public static int pathSumSlow(TreeNode root, int targetSum) {
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
