package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int maxDepth(TreeNode root) {

        
        if (root == null){
            return 0;
        }

        int dl = maxDepth(root.left);
        int dr = maxDepth(root.right);

        if (dl > dr){
            return dl+1;
        }
        else{
            return dr+1;
        }
    }
}
