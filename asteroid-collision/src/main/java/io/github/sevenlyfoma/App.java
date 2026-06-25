package io.github.sevenlyfoma;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] inp = {-2,-2,1,-2};
        System.out.println("" + Arrays.toString(asteroidCollision(inp)));

    }

    public static int[] asteroidCollision(int[] asteroids) {
        int[] collided = new int[asteroids.length];
        

        int head = -1;

        for (int i = 0; i < asteroids.length; i++){
            int x = asteroids[i];

            // System.out.println("" + Arrays.toString(collided));
            // System.out.println("" + head);


            if (head == -1){
                collided[0] = x;
                head++;
            }
            else{
                int currentHead = collided[head];

                boolean notDestroyed = true;
            
                while ((x < 0 && currentHead > 0 && head != -1 && notDestroyed)){
                    
                    int absX = Math.abs(x);
                    int absCH = Math.abs(currentHead);

                    // System.out.println("" + absX + " " + absCH);

                    if (absX == absCH){
                        // System.out.println("e0");
                        head --;
                        notDestroyed = false;
                    }
                    else if (absX > absCH){
                        // System.out.println("e1");
                        head --;
                    }
                    else{
                        // System.out.println("e2");
                        notDestroyed = false;
                    }
                    

                    if (head != -1){
                        currentHead = collided[head];
                    }
                }

                if (notDestroyed){
                    head++;
                    collided[head] = x;
                    // System.out.println("" + Arrays.toString(collided));
                }
            }

            


        }

        

        return Arrays.copyOfRange(collided, 0, head+1);
    }
}
