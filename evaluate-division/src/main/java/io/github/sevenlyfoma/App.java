package io.github.sevenlyfoma;

import java.util.ArrayList;
import java.util.HashMap;
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
        System.out.println( "Hello World!" );
    }

    public record Edge (String vertex, double weight){}

    public static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        HashMap<String, ArrayList<Edge>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++){
            List<String> eq = equations.get(i);
            double val = values[i];

            String v1 = eq.get(0);
            String v2 = eq.get(1);

            graph.putIfAbsent(v1, new ArrayList<>());
            graph.putIfAbsent(v2, new ArrayList<>());

            graph.get(v1).add(new Edge(v2, val));
            graph.get(v2).add(new Edge(v1, 1/val));
        }

        double[] res = new double[queries.size()];

        for (int i = 0; i < res.length; i++){
            res[i] = calcOneEquation(queries.get(i), graph);
        }


        
        return res;
    }

    public static double calcOneEquation(List<String> query, HashMap<String, ArrayList<Edge>> graph){

        String start = query.get(0);
        String finish = query.get(1);

        if (!graph.containsKey(start) || !graph.containsKey(finish)){
            return -1;
        }

        HashSet<String> visited = new HashSet<>();

        return dfsCalc(start, finish, graph, visited);
    }

    public static double dfsCalc(String current, String finish, HashMap<String, ArrayList<Edge>> graph, HashSet<String> visited){
        if (current.equals(finish)){
            return 1;
        }
        
        ArrayList<Edge> options = graph.get(current);

        visited.add(current);

        double result = -1;
        int i = 0;

        while (result < 0 && i < options.size()){
            Edge e = options.get(i);

            if (!visited.contains(e.vertex)){
                result = e.weight * dfsCalc(e.vertex, finish, graph, visited);  
            }

            i++;
        }



        return result;
    }
}
