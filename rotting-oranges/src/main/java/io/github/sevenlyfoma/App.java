package io.github.sevenlyfoma;

import java.util.ArrayDeque;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   

        int[][] grid ={{2,1,1},{1,1,1},{0,1,2}};

        // printGrid(grid);

        orangesRotting(grid);
    }

    public static void printGrid(int[][] grid){
        int height = grid.length;
        int width = grid[0].length;


        for (int y = 0; y < height; y++){
            for (int x = 0; x < width; x++){
                switch (grid[y][x]) {
                    case 2 -> System.out.print("X");
                    case 1 -> System.out.print("O");
                    default -> System.out.print(".");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }

    public record Point(int x, int y){}

    public static int orangesRotting(int[][] grid) {
        ArrayDeque<Point> bfsQ = new ArrayDeque<>();

        int height = grid.length;
        int width = grid[0].length;

        int freshOranges = 0;
        

        for (int y = 0; y < height; y++){
            for (int x = 0; x < width; x++){
                if (grid[y][x] == 2){
                    bfsQ.add(new Point(x, y));
                }
                else if (grid[y][x] == 1){
                    freshOranges++;
                }
            }
        }

        int minuteNumber = 0;
        int orangesThisMinute = 1;
        int orangesNextMinutes = bfsQ.size();

        while (!bfsQ.isEmpty() && freshOranges != 0){
            
            orangesThisMinute--;
            if (orangesThisMinute == 0){
                orangesThisMinute = orangesNextMinutes;
                orangesNextMinutes = 0;
                minuteNumber++;
            }

            Point p = bfsQ.poll();

            int x = p.x;
            int y = p.y;

            grid[y][x] = 2;

            if (x - 1 >= 0 && grid[y][x-1] == 1){
                freshOranges--;
                orangesNextMinutes++;
                bfsQ.add(new Point(x - 1, y));
                grid[y][x-1] = 2;
            }
            if (x + 1 < width && grid[y][x+1] == 1){
                freshOranges--;
                orangesNextMinutes++;
                bfsQ.add(new Point(x + 1, y));
                grid[y][x+1] = 2;
            }

            if (y - 1 >= 0 && grid[y - 1][x] == 1){
                freshOranges--;
                orangesNextMinutes++;
                bfsQ.add(new Point(x, y - 1));
                grid[y-1][x] = 2;
            }
            if (y + 1 < height && grid[y + 1][x] == 1){
                freshOranges--;
                orangesNextMinutes++;
                bfsQ.add(new Point(x, y + 1));
                grid[y+1][x] = 2;
            }

            
        }

        

        if (freshOranges != 0){
            return -1;
        }

        return minuteNumber;
    }
}
