package io.github.sevenlyfoma;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{

    static char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {
        System.out.println(reverseVowels("icecream"));
    }


    public static String reverseVowels(String s){

        if (s.length() <= 1){
            return s;
        }

        int lp = 0; 
        int rp = s.length() - 1;
        

        char[] newString = new char[s.length()];

        char lc = 'z';
        char rc = 'z';

        Boolean lVowel = false;
        Boolean rVowel = false;

        while (lp <= rp){
            if (!lVowel){
                lc = s.charAt(lp);
                lVowel = isVowel(Character.toLowerCase(lc));
                if (!lVowel){
                    
                    newString[lp] = lc;
                    lp++;
                    
                    lc = 0;
                }
            }

            if (!rVowel){
                rc = s.charAt(rp);
                rVowel = isVowel(Character.toLowerCase(rc));
                if (!rVowel){
                    
                    newString[rp] = rc;
                    rp--;

                    rc = 0;
                }
            }

            if (lVowel && rVowel){
                newString[lp] = rc;
                newString[rp] = lc;

                lVowel = false;
                rVowel = false;

                lp++;
                rp--;

                lc = 0;
                rc = 0;
            }

        }

        if (lc != 0){
            newString[lp] = lc;
        }
        if (rc != 0){
            newString[rp] = rc;
        }

        return (new String(newString));
    }

    public static String reverseVowelsOld(String s) {
        

        String lowercase = s.toLowerCase();

        ArrayList<Integer> positions = new ArrayList<>();

        for (int i = 0; i < s.length(); i++){
            char c = lowercase.charAt(i);
            

            if (isVowel(c)){
                positions.add(i);
            }
        
        }

        StringBuilder sb = new StringBuilder();

        int currentReplacer = positions.size()-1;

        for (int i = 0; i < s.length(); i++){
            char c = lowercase.charAt(i);

            if (isVowel(c)){
                positions.add(i);
                char cx = s.charAt(positions.get(currentReplacer));
                currentReplacer -= 1;
                sb.append(cx);
            }

            else{
                char cx = s.charAt(i);
                sb.append(cx);
            }
        }

        return sb.toString();

    }


    public static Boolean isVowel(char c){
        
        Boolean isVowel = false;
        int j = 0;
        while (!isVowel && j < 5) {
            if (vowels[j] == c){
                isVowel = true;
            }
            j++;
        }

        return isVowel;
    }

    public static void printBuld(char[] cs){
        for (int i = 0; i< cs.length; i++){
            if (cs[i] == 0){
                System.out.print("#");
            }
            else{
                System.out.print(cs[i]);
            }
           
        }
        System.out.print("\n");
    }
}
