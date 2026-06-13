package io.github.sevenlyfoma;

import java.util.Stack;

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

    public static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();


        
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (c != '*'){
                sb.append(c);
            }
            else{
                sb.deleteCharAt(sb.length()-1);
            }
        }

        return sb.toString();
    }

    public static String removeStarsSlow(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (c != '*'){
                stack.push(c);
            }
            else{
                stack.pop();
            }
        }

        String ns = "";

        for (int i = 0; i < stack.size(); i++){
            ns += stack.elementAt(i);
        }

        return ns;
    }
}
