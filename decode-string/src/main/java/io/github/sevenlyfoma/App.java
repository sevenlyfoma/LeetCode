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

    public static String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        
        stringStack.push(new StringBuilder());
        
        int i = 0;

        StringBuilder currentNumber = new StringBuilder();

        StringBuilder currentString = new StringBuilder();

        boolean numberPhase = false;
        while (i < s.length()){
            char c = s.charAt(i);

            if (c == '['){
                numberPhase = false;
                numberStack.push((Integer) Integer.parseInt(currentNumber.toString()));
                currentNumber = new StringBuilder();
                
            }
            else if (c == ']'){
                int repititions = numberStack.pop();
                
                String toRepeat = currentString.toString();

                currentString = stringStack.pop();

                for (int r = 0; r < repititions; r++){
                    currentString.append(toRepeat);
                }

            }
            else if (!numberPhase && Character.isDigit(c)){
                numberPhase = true;
                stringStack.push(currentString);
                currentString = new StringBuilder();

                
            }

            if (numberPhase){
                currentNumber.append(c);
            }

            else{
                if (c != '[' && c != ']'){
                    currentString.append(c);
                }
                
            }


            i++;
        }


        return currentString.toString();
    }
    
}
