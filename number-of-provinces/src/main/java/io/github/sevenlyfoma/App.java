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

    public static int findCircleNum(int[][] isConnected) {

        int groupsCreated = 0;

        HashMap<Integer, Integer> tracker = new HashMap<>();

        for (int i = 0; i < isConnected.length; i++){
            if (!tracker.containsKey(i)){
                groupsCreated++;
                addAllAdjacent(i, isConnected, tracker, groupsCreated);
            }
        }
        

        return groupsCreated;
    }

    public static void addAllAdjacent(
        int index,
        int[][] isConnected, 
        HashMap<Integer, Integer> tracker, 
        int groupNumber
    ){
        if (tracker.containsKey(index)){
            return;
        }

        tracker.put(index, groupNumber);

        int[] current = isConnected[index];

        for (int i = 0; i < current.length; i++){
            if (i != index){
                if (current[i] == 1){
                    addAllAdjacent(i, isConnected, tracker, groupNumber);
                }
            }
        }



    }
}
