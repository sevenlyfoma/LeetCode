package io.github.sevenlyfoma;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<List<Integer>> inp = List.of(List.of(1,3),List.of(3,0,1),List.of(2),List.of());
        
        System.out.println(App.canVisitAllRooms(inp));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        ArrayDeque<Integer> currentKeys = new ArrayDeque<>();

        

        HashSet<Integer> visited = new HashSet<>();

        visited.add(0);

        addKeys(currentKeys, rooms.get(0), visited);

        int roomsVisted = 1;

        while (!currentKeys.isEmpty()){
            int currentKey = currentKeys.poll();

            roomsVisted++;

            addKeys(currentKeys, rooms.get(currentKey), visited);
        }
        return roomsVisted == rooms.size();
    }

    public static void addKeys(ArrayDeque<Integer> currentKeys, List<Integer> newKeys, HashSet<Integer> visited){
        for (Integer x: newKeys){
            if (!visited.contains(x)){
                currentKeys.add(x);
                visited.add(x);
            }
        }
    }
}
