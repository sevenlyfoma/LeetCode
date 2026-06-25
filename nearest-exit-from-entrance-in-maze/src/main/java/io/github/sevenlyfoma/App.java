package io.github.sevenlyfoma;

import java.util.ArrayDeque;
import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        // char[][] maze = {{'+','.','+','+','+','+','+'},{'+','.','+','.','.','.','+'},{'+','.','+','.','+','.','+'},{'+','.','.','.','+','.','+'},{'+','+','+','+','+','.','+'}};
        // int[] entrance = {0,1};

        char[][] maze = {{'.','+'}};
        int[] entrance = {0,0};

        printMap(maze, entrance);

        System.out.println(nearestExit(maze, entrance));
    }

    public static void printMap(char[][] maze, int[] entrance) {
        for (int i = 0; i < maze.length; i++){
            for (int j = 0; j < maze[0].length; j++){
                if (i == entrance[0] && j == entrance[1]){
                    System.out.print("X");
                }
                else{
                    System.out.print(maze[i][j]);
                }
            }
            System.out.println("");
        }

    }

    public static int nearestExit(char[][] maze, int[] entrance) {

        ArrayDeque<Integer> xQ = new ArrayDeque<>(512);
        ArrayDeque<Integer> yQ = new ArrayDeque<>(512);

        xQ.add(entrance[1]);
        yQ.add(entrance[0]);

        boolean exitFound = false;

        int maxX = maze[0].length - 1;
        int maxY = maze.length - 1;

        int distance = 0;
        int numberAtDistance = 1;
        int numberAtNextDistance = 0;
        int minDistance = 0;

        while (!exitFound && !xQ.isEmpty()){
            int x = xQ.poll();
            int y = yQ.poll();

            if (maze[y][x] != 0) {

                maze[y][x] = 0;

                if (distance != 0 && (x == 0 || y == 0 || x == maxX || y == maxY)){
                    exitFound = true;
                    minDistance = distance;
                }
                else{
                    if (x + 1 <= maxX && maze[y][x + 1] == '.'){
                        xQ.add(x+1);
                        yQ.add(y);
                        numberAtNextDistance++;
                    }

                    if (x - 1 >= 0 && maze[y][x - 1] == '.'){
                        xQ.add(x-1);
                        yQ.add(y);
                        numberAtNextDistance++;
                    }

                    if (y + 1 <= maxY && maze[y+1][x] == '.'){
                        xQ.add(x);
                        yQ.add(y+1);
                        numberAtNextDistance++;
                    }

                    if (y-1 >= 0 && maze[y-1][x] == '.'){
                        xQ.add(x);
                        yQ.add(y-1);
                        numberAtNextDistance++;
                    }
                }
            }
            numberAtDistance--;
            if (numberAtDistance == 0){
                distance++;
                numberAtDistance = numberAtNextDistance;
                numberAtNextDistance = 0;
            }
        }
        
        if (!exitFound){
            return -1;
        }

        return minDistance;
    }

    public record Point (int x, int y) {}

    public static int nearestExitSlow(char[][] maze, int[] entrance) {

        ArrayDeque<Point> bfsQ = new ArrayDeque<>();

        bfsQ.add(new Point(entrance[1], entrance[0]));

        boolean exitFound = false;

        int maxX = maze[0].length - 1;
        int maxY = maze.length - 1;

        int distance = 0;
        int numberAtDistance = 1;
        int numberAtNextDistance = 0;
        int minDistance = 0;

        HashSet<Point> visited = new HashSet<>();

        while (!exitFound && !bfsQ.isEmpty()){
            Point p = bfsQ.poll();

            if (!visited.contains(p)) {

                visited.add(p);

                int x = p.x;
                int y = p.y;

                if (distance != 0 && (x == 0 || y == 0 || x == maxX || y == maxY)){
                    exitFound = true;
                    minDistance = distance;
                }
                else{
                    if (x + 1 <= maxX && maze[y][x + 1] == '.'){
                        bfsQ.add(new Point(x+1, y));
                        numberAtNextDistance++;
                    }

                    if (x - 1 >= 0 && maze[y][x - 1] == '.'){
                        bfsQ.add(new Point(x-1, y));
                        numberAtNextDistance++;
                    }

                    if (y + 1 <= maxY && maze[y+1][x] == '.'){
                        bfsQ.add(new Point(x, y+1));
                        numberAtNextDistance++;
                    }

                    if (y-1 >= 0 && maze[y-1][x] == '.'){
                        bfsQ.add(new Point(x, y-1));
                        numberAtNextDistance++;
                    }
                }
            }
            numberAtDistance--;
            if (numberAtDistance == 0){
                distance++;
                numberAtDistance = numberAtNextDistance;
                numberAtNextDistance = 0;
            }
        }
        
        if (!exitFound){
            return -1;
        }

        return minDistance;
    }
}
