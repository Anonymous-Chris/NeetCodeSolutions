package graphs.islandperimeter;

import print.PrintItem;

public class CountLandsSolution {
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
        int landCells = 0;
        int sharedEdges = 0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] == 1){
                    landCells++;
                    //check right
                    if(j + 1 < cols && grid[i][j + 1] == 1){
                        sharedEdges++;
                    }
                    //check down
                    if(i + 1 < rows && grid[i + 1][j] == 1) {
                        sharedEdges++;
                    }
                }
            }
        }
        return landCells*4-sharedEdges*2;
    }
}

/*
Idea

Every land cell contributes 4
Every shared edge between two land cells removes 2 from perimeter
Time Complexity: O(m * n)
Where m is the number of rows and n is the number of columns in the grid.
We traverse each cell in the grid once, leading to a time complexity proportional to the total number
of cells..
Space Complexity: O(1)
We use a constant amount of extra space (the landCells, sharedEdges variables and loop counters),
regardless of the input grid size.
 */