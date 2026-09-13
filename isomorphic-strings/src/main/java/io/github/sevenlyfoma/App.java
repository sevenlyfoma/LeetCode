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

    public static boolean isIsomorphic(String s, String t) {
        
        int[] hm1 = new int[128];

        int[] hm2 = new int[128];


        int l = s.length();

        int i = 0;

        boolean matches = true;

        while (matches && i < l){
            int c1 = s.charAt(i);
            int c2 = t.charAt(i);

            boolean hm1C = hm1[c1] != 0;
            boolean hm2C = hm2[c2] != 0;

            if (!hm1C && !hm2C){
                hm1[c1] = c2;
                hm2[c2] = c1;
            }
            else{
                if ((!hm2C) || (!hm1C)){
                    matches = false;
                }
                else {
                    if (hm1[c1] != c2 || hm2[c2] != c1){
                        matches = false;
                    } 
                }
            }


            i++;
        }


        return matches;
    }

    public static boolean isIsomorphicSlow(String s, String t) {
        
        HashMap<Character, Character> hm1 = new HashMap<>();

        HashMap<Character, Character> hm2 = new HashMap<>();

        int l = s.length();

        int i = 0;

        boolean matches = true;

        while (matches && i < l){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            boolean hm1C = hm1.containsKey(c1);
            boolean hm2C = hm2.containsKey(c2);

            if (!hm1C && !hm2C){
                hm1.put(c1, c2);
                hm2.put(c2, c1);
            }
            else{
                if ((hm1C && !hm2C) || (!hm1C && hm2C)){
                    matches = false;
                }
                else {
                    if (hm1.get(c1) != c2 || hm2.get(c2) != c1){
                        matches = false;
                    } 
                }
            }


            i++;
        }


        return matches;
    }
}
