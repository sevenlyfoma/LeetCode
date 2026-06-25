package io.github.sevenlyfoma;

import java.util.Arrays;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] temperatures = {73,74,75,71,69,72,76,7};
        System.out.println("\nOutput: ");
        System.out.println( Arrays.toString(dailyTemperatures(temperatures)) );

        int[] out = {1,1,4,2,1,1,0,0};
        System.out.println("Should be: ");
        System.out.println(Arrays.toString(out));
    }

    public record Tday(int val, int pos){}

    public static int[] dailyTemperatures(int[] temperatures) {

        Stack<Tday> s = new Stack<>();

        for(int i = 0; i < temperatures.length; i ++){
            int t = temperatures[i];
            temperatures[i] = 0;
            while (!s.isEmpty() && s.peek().val < t){
                Tday popped = s.pop();
                temperatures[popped.pos] = i - popped.pos;
            }
            s.push(new Tday(t, i));
        }
        

        return temperatures;
    }
}
