package io.github.sevenlyfoma;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[][] inp = {{4,3},{2,3},{1,2},{1,0}};

        System.out.println("" + minReorder(5, inp));
    }

    public record Edge (int vertex, boolean outgoing) {}

    public static int minReorder(int n, int[][] connections) {

        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n-1; i++){
            int[] conn = connections[i];

            int send = conn[0];
            int recv = conn[1];

            graph.get(send).add(new Edge(recv, true));
            graph.get(recv).add(new Edge(send, false));
        }
        



        return dfs(0, -1, graph);
    }

    public static int dfs(int current, int previous, List<List<Edge>> graph){

        int swaps = 0;

        for (Edge e: graph.get(current)){

            if (e.vertex != previous){
                if (e.outgoing){
                    swaps++;
                }

                swaps += dfs(e.vertex, current, graph);
            }
        }

        return swaps;
    }

    public static int minReorderSlow2(int n, int[][] connections) {

        HashMap<Integer, ArrayDeque<Integer>> to = new HashMap<>();

        HashMap<Integer, ArrayDeque<Integer>> from = new HashMap<>();

        // System.out.println(to[0]);

        for (int i = 0; i < n-1; i++){
            int[] conn = connections[i];

            int x = conn[0];
            int y = conn[1];

            to.putIfAbsent(x, new ArrayDeque<>());
            to.putIfAbsent(y, new ArrayDeque<>());
            to.get(x).add(y);

            from.putIfAbsent(x, new ArrayDeque<>());
            from.putIfAbsent(y, new ArrayDeque<>());
            from.get(y).add(x);
        }

        // System.out.println(to);
        // System.out.println(from);
        

        return reorderDfs(-1, 0, to, from);

        //[0,1] [4,0]

        //So to includes 0 -> 1      0 -> 4
        //From includes 4 -> 0        1 -> 0
    }

    public static int reorderDfs(int previous, int current, HashMap<Integer, ArrayDeque<Integer>>  to, HashMap<Integer, ArrayDeque<Integer>>  from){
        
        int reorders = 0;

        ArrayDeque<Integer> toDQ = to.get(current);

        ArrayDeque<Integer> fromDQ = from.get(current);

        while (!toDQ.isEmpty()){
            int x = toDQ.poll();

            if (x != previous){
                reorders++;
                fromDQ.add(x);
            } 
        }


        while (!fromDQ.isEmpty()){
            reorders += reorderDfs(current, fromDQ.poll(), to, from);
        }
    

        return reorders;
    }

    public static int minReorderSlow(int n, int[][] connections) {


        //Because connections.lenth = n-1, there are never any circles

        boolean[] pointingAtZero = new boolean[n];

        boolean[] linkstoZero = new boolean[n-1];

        int reorders = 0;

        pointingAtZero[0] = true;

        int correctPaths = 0;

        while (correctPaths != n -1){

            for (int i = 0; i < n-1; i++){
                if (!linkstoZero[i]){
                    int[] connection = connections[i];

                    if (pointingAtZero[connection[0]]){
                        reorders++;
                        correctPaths++;
                        pointingAtZero[connection[1]] = true;

                        linkstoZero[i] = true;

                    }
                    else if (pointingAtZero[connection[1]]){
                        correctPaths++;
                        pointingAtZero[connection[0]] = true;
                        linkstoZero[i] = true;
                    }


                }


            }


        }

        

        
    
        return reorders;
    }
}
