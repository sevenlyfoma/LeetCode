package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //"axaacbb", "aaacbbb"
        // System.out.println(App.minDistance("axaacbb", "aaacbbb"));

        // System.out.println(App.minDistance("aacbbb", "aaacbbb"));

        // System.out.println(App.minDistance("aaaxbbbb", "aaaabbbb"));

        // System.out.println(App.minDistance("intention", "execution"));

        // System.out.println(App.minDistance("horse", "ros"));
        // System.out.println(App.minDistance("mart", "karma"));

        // System.out.println(App.minDistance("park", "spake"));

        // System.out.println(App.minDistance("park", "parka"));
        // System.out.println(App.minDistance("sea", "ate"));

        // System.out.println(App.minDistance("spartan", "part"));

        System.out.println(App.minDistance("plasma", "altruism"));

        // System.out.println(App.minDistance("dinitrophenylhydrazine", "phenylhydrazine"));
    }

    
 
    public static void printArrayAndWords(int[][] arr, String word1, String word2){
        int i = 0;
        System.out.print("   ");
        for (int j = 0; j < word2.length(); j++){
            System.out.print(" " + word2.charAt(j) + " ");
        }
        System.out.println("");
        for (int[] x: arr){
            if (i < word1.length()) { 
                if (i < 10){
                    System.out.print(" ");
                }
                System.out.print(word1.charAt(i) + ": ");
            }
            else {
                System.out.print("   ");
            }
            for (int y: x){
                if (y < 10){
                    System.out.print(" ");
                }
                System.out.print(y + " ");
            }

            System.out.print("\n");
            i++;
        }
    }

    public static void printArray(int[][] arr){
        int i = 0;
        for (int[] x: arr){
            if (i < 10){
                    System.out.print(" ");
            }
            System.out.print(i + ": ");
            for (int y: x){
                if (y < 10){
                    System.out.print(" ");
                }
                System.out.print(y + " ");
            }

            System.out.print("\n");
            i++;
        }
    }

    //Copied from another leetcode solution after creating my own slow solution
    //They both pass, but slow takes 50x as long (3ms vs 150ms)
    public static int minDistance(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        //Dp is n+1 because it must have a base case
        int[] dp = new int[n+1];

        //First fill with dummy values of the base case for full word1 empty word2
        //So if word1 is 5 long and word2 is 0, then the longest will be 5
        for (int i = 0; i <= n; i++){
            dp[i] = i;
        }

        for (int i = 1; i <= m; i++){

            //At the start of our loop our "topleft" value, which is the result of the successfull ni * mi array is the first value
            int topLeft = dp[0];
            //In the new loop we are one down, so our starting value is 1 more
            dp[0] = i;

            for (int j = 1; j <= n; j++){

                //The current left is the cell to the left
                int left = dp[j - 1];
                //The current top is the current cell, since it hasnt been overwritten, it represents last rows cell above this
                int top = dp[j];

                //if our letters are the same, then our new solve size is just the solve size of the previous 2 strings minus mi and ni
                if(word1.charAt(j-1) == word2.charAt(i-1)){
                    dp[j] = topLeft;
                }
                //If not we get the minimum of the solves of ni,mi ni,mi-1 and ni-1,mi, and add 1, representing a swap, insertion or deletion
                else{
                    dp[j] = Math.min(Math.min(left, top), topLeft) + 1;
                }
                //Our new top left value is our old top value, making sure it doesnt get lose
                topLeft = top;
            }
        }

        return dp[n];
    }

    //Slow solution, not very good
    public static int minDistanceSlow(String word1, String word2) {
        if (word1.length() == 0){
            return word2.length();
        }
        if (word2.length() == 0){
            return word1.length();
        }

        String longerWord = word1;
        String shorterWord = word2;

        if (word1.length() < word2.length()){
            longerWord = word2;
            shorterWord = word1;
        }

        int n = longerWord.length() + 1 + 2;
        int m = shorterWord.length() + 1 + 2;

        int dp[][] = new int[n][m];

        for (int i = 0; i < n; i++){
            dp[i][0] = i + 1;
        }

        for (int i = 1; i < n; i++){
            dp[i][1] = i -1;
        }

        for (int j = 1; j < m; j++){
            dp[0][j] = j + 1;
        }

        for (int j = 2; j < m; j++){
            dp[1][j] = j - 1;
        }

        for (int i = 2; i < n; i++){
            for (int j = 2; j < m; j ++){

                int count = 0;

                int lIndex = i - 2;
                int sIndex = j - 2;

                if (lIndex < longerWord.length() && sIndex < shorterWord.length()){
                    if (longerWord.charAt(lIndex) != shorterWord.charAt(sIndex)){
                        count += 1;
                    }
                }


                int min;

                min = dp[i-1][j-1];

                int numDeleting = 1;
                for (int ni = i-2; ni >= 0; ni--){
                        
                    min = Math.min(min, dp[ni][j-1] + numDeleting);

                    numDeleting++;
                }


                int numInserting = 1;
                for (int nj = j-2; nj >= 0; nj--){
                        
                    min = Math.min(min, dp[i-1][nj] + numInserting);

                    numInserting++;
                }
                


                

                count += min;
               

                dp[i][j] = count;

            



            }
        }


        return dp[n-1][m-1];
    }
}
