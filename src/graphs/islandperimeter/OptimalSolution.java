package graphs.islandperimeter;

import print.PrintItem;

public class OptimalSolution {
    static void main(String[] args) {
        //4x4matrinx
        int [][] grid = {
                {1,1,0,0},
                {1,0,0,0},
                {1,1,1,0},
                {0,0,1,1}
        };
        PrintItem.print(islandPerimeter(grid));
        int [][] grid1 = {{1,0}};
        PrintItem.print(islandPerimeter(grid1));
    }
    public static int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j<cols; j++){
                if(grid[i][j] == 1){
                    perimeter += 4;
                    //check up
                    if(i > 0 && grid[i-1][j] == 1){
                        perimeter -= 2;
                    }
                    //check left
                    if(j > 0 && grid[i][j-1] == 1){
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}
/*
Time:  O(m * n)
Space: O(1)
 */