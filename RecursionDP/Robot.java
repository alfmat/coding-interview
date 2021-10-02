// the robot is sitting in the top left corner of the grid
// let's assume the grid size is 100x100
// There are options in this grid
// 0|1|0
// 0|x|1
// 1|0|1
//
package RecursionDP;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.awt.Point;

public class Robot {
    public static void main(String args[]) {
        System.out.println("This is working");
        
        int grid[][] = createGrid();
        for(int[] row: grid) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println(getPath(grid));
    }

    public static int[][] createGrid() {
        int grid[][] = new int[10][10];
        for(int i = 0; i < grid.length; i++) {
            grid[i] = new Random().ints(0,2).limit(10).toArray();
        }
        return grid;
    }

    public static ArrayList<Point> getPath(int grid[][]) {
       ArrayList<Point> path = new ArrayList<Point>();
       if(getPath(grid, grid.length - 1, grid[0].length - 1, path)) {
           return path;
       }
       return path;
    }

    
    public static boolean getPath(int grid[][], int row, int col, ArrayList<Point> path) {
        if(col < 0 || row < 0 || grid[0][0]!=grid[row][col]) {
            return false;
        }

        boolean isAtOrigin = (row == 0) && (col == 0);

        if(isAtOrigin || getPath(grid, row, col-1, path) || getPath(grid, row-1, col, path)) {
            Point p = new Point(row, col);
            path.add(p);
            return true;
        }

        return false;
    }
}
