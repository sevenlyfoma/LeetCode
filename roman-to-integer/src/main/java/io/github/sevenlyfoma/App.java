package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String inp = "MCMXCIV";
        System.out.println(romanToInt(inp));
    }

    public static int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length()-1; i ++){
            char c = s.charAt(i);

            int currentVal = singleRomanToInt(c);
            int nextVal = singleRomanToInt(s.charAt(i+1));
            
            if (nextVal > currentVal){
                total -= currentVal;
            }
            else{
                total += currentVal;
            }
        }

        total += singleRomanToInt(s.charAt(s.length()-1));



        return total;
    }

    public static int singleRomanToInt(char c){
        switch (c) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }

            default -> throw new AssertionError();
        }
    }
}
