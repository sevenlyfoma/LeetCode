package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // String text1 = "abcab";
        // String text2 = "aebc" ;

        // String text1 = "oxcpqrsvwf";
        // String text2 =  "shmtulqrypy";

        String text1 = "aa";
        String text2 = "aaaa" ;

        // String text1 = "abcde";
        // String text2 = "ace" ;

        // String text1 = "aaaa";
        // String text2 = "a" ;

        System.out.println(longestCommonSubsequence(text1, text2));
    }

    public static void printArray(int[][] arr){
        int i = 0;
        for (int[] x: arr){
            System.out.print(i + ":");
            for (int y: x){
                System.out.print(y);
                System.out.print(" ");
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
    

    public static int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()][text2.length()];

        for (int i = 0; i < text1.length(); i++){
            for (int j = 0; j < text2.length(); j++){

                if (text1.charAt(i) == text2.charAt(j)){
                    if (i != 0 && j != 0){
                        dp[i][j] = dp[i-1][j-1] +1;
                    }
                    else{
                        dp[i][j] = 1;
                    }
                }
                else{
                    int left = 0;
                    if (j != 0) left = dp[i][j-1];
                    int right = 0;
                    if (i != 0) right = dp[i-1][j];

                    if (left > right){
                        dp[i][j] = left;
                    }
                    else {
                        dp[i][j] = right;
                    }
                }
            
            }
        }

        return dp[text1.length()-1][text2.length()-1];
    }
}
