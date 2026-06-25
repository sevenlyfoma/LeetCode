package io.github.sevenlyfoma;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static boolean closeStrings(String word1, String word2) {
        int[] w1Map = new int[26];
        int[] w2Map = new int[26];

        for (int i = 0; i < word1.length(); i++){
            w1Map[word1.charAt(i)-'a']++;
        }

        for (int i = 0; i < word2.length(); i++){
            w2Map[word2.charAt(i)-'a']++;
        }

        for (int i = 0; i < 26; i++){
            if ((w1Map[i] == 0) != (w2Map[i] == 0)){
                return false;
            }
        }

        Arrays.sort(w1Map);
        Arrays.sort(w2Map);

        for (int i = 0; i < 26; i++){
            if (w1Map[i] != w2Map[i]){
                return false;
            }
        }


        return true;

    }

    public static boolean closeStringsVerySlow(String word1, String word2) {
        HashMap<Character, Integer> w1Map = new HashMap<>();

        HashMap<Character, Integer> w2Map = new HashMap<>();

        fillMap(word1, w1Map);
        fillMap(word2, w2Map);

        if (w1Map.keySet().equals(w2Map.keySet())){
            ArrayList<Integer> w1ValueList = new ArrayList<>(w1Map.values());
            ArrayList<Integer> w2ValueList = new ArrayList<>(w2Map.values());

            w1ValueList.sort(null);
            w2ValueList.sort(null);

            if (w1ValueList.equals(w2ValueList)){
                return true;
            }
        }



        return false;
    }

    public static void fillMap(String word, HashMap<Character, Integer> wMap){
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            wMap.putIfAbsent(c, 0);
            wMap.put(c, wMap.get(c)+1);
        }
    }
}
