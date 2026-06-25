package io.github.sevenlyfoma;

import java.util.ArrayList;
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

    public static char[][] mappings = {
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'}
    };

    public static int[] lengths = {
        3,
        3,
        3,
        3,
        3,
        4,
        3,
        4
    };

    public static List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();

        char[] builder = new char[digits.length()];

        buildRecursive(digits, 0, ans, builder);

        return ans;
    }

    public static void buildRecursive(
        String digits, 
        int position, 
        ArrayList<String> ans,
        char[] builder
    ){
        int index = digits.charAt(position) - 50;
        

        if (position == digits.length() - 1){
            for (int i = 0; i < lengths[index]; i++){
                builder[position] = mappings[index][i];
                ans.add(String.valueOf(builder));
            }
        }
        else{
            for (int i = 0; i < lengths[index]; i++){
                builder[position] = mappings[index][i];
                buildRecursive(digits, position+1, ans, builder);
            }
        }



    }
}
