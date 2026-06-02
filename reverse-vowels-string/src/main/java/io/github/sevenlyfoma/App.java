package io.github.sevenlyfoma;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{

    static char[] vowels = {'a', 'e', 'i', 'o', 'u'};


    public static void main(String[] args){
        reverseVowels("IceCreAm");
    }

    public static String reverseVowels(String s) {
        

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
}
