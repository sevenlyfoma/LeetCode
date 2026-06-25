package io.github.sevenlyfoma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();

        Integer[] builder = new Integer[k];

        buildRecursive(n, 0, 0, 1, k, ans, builder);

        return ans;
    }

    public static void buildRecursive(
        int n,
        int position,
        int runningTotal,
        int num, 
        int k,
        List<List<Integer>> ans,
        Integer[] builder
    ){
        if (position == k -1 ){
            for (int i = num; i <= 9; i++){
                builder[position] = i;
                runningTotal+=i;
                
                if (runningTotal == n){
                    ans.add(new ArrayList<>(Arrays.asList(builder)));
                }
                runningTotal-=i;

            }
        }
        else {
            for (int i = num; i <= 9; i++){
                builder[position] = i;
                buildRecursive(n, position+1, runningTotal+i, i+1, k, ans, builder);

            }
        }
        



    }
}
