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
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        //If theyre both null then we dont have either p or q
        if (left == null && right == null){
            return null;
        }
        //If both arent null, then we have p and q in our left and right, so we know we are the lowest common ancestor
        else if (left != null && right != null){
            return root;
        }
        //IF we only have one this means that either
        // 1. the lowest common ancestor of both p and q has been passed to us, so we just want to pass it up the chain
        // 2. only 1 of p and q have been found lower down, and we will pass this info up, if a second of p and q are found higher up, thatll be the root
        else{
            if (left == null){
                return right;
            }
            else{
                return left;
            }
        }

    }

    public static TreeNode lowestCommonAncestorSlow(TreeNode root, TreeNode p, TreeNode q) {
        return lowestCommonAncestorR(root, p, q).node;
    }

    public record RetValue (TreeNode node, int foundCount) {}

    public static RetValue lowestCommonAncestorR(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return new RetValue(null, 0);
        }

        RetValue left = lowestCommonAncestorR(root.left, p, q);
        RetValue right = lowestCommonAncestorR(root.right, p, q);

        if (left.foundCount == 3){
            return left;
        }
        if (right.foundCount == 3){
            return right;
        }

        int thisFoundCount = 0;

        if (root == p){
            thisFoundCount = 1;
        }
        else if (root == q){
            thisFoundCount = 2;
        }

        return new RetValue(root, thisFoundCount+left.foundCount+right.foundCount);
    }

    // public static int isAncestor(TreeNode node, TreeNode p, TreeNode q){
    //     if (node == null){
    //         return 0;
    //     }


    //     return 0;
    // }
}
