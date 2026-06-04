package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] split = s.strip().split("\\s+");

        for (int i = split.length-1; i >= 0; i--){
            sb.append(split[i]);
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length()-1);


        return sb.toString();
    }
}
