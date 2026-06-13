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
        System.out.println( "Hello World!" );
    }

    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> occurenceCount = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            int x = arr[i];
            occurenceCount.putIfAbsent(x, 0);
            occurenceCount.put(x, occurenceCount.get(x)+1);
        }

        HashMap<Integer, Integer> occurenceCountCount = new HashMap<>();

        for (Integer v: occurenceCount.values()){
            if (occurenceCountCount.containsKey(v)){
                return false;
            }
            else{
                occurenceCountCount.put(v, 0);
            }
        }
        
        return true;
    }
}
