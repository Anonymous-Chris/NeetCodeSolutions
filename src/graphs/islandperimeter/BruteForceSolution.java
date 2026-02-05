package graphs.islandperimeter;

import print.PrintItem;

public class BruteForceSolution {
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
                    //up
                    if(i == 0 || grid[i-1][j] == 0){
                        perimeter++;
                    }
                    //down
                    if(i == rows - 1 || grid[i+1][j] == 0){
                        perimeter++;
                    }
                    //left
                    if(j == 0 || grid[i][j-1] == 0){
                        perimeter++;
                    }
                    //right
                    if(j == cols - 1 || grid[i][j+1] == 0){
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
}
/*
Time Complexity: O(m * n)
Where m is the number of rows and n is the number of columns in the grid.
We traverse each cell in the grid once, leading to a time complexity proportional to the total number
of cells.
Space Complexity: O(1)
We use a constant amount of extra space (the perimeter variable and loop counters),
regardless of the input grid size.

Simple explanation:
The nested loops visit every cell in the grid (every row and column).
If a cell is land (value 1), the code checks its four sides: up, down, left, right.
For each side, if that side is outside the grid (edge) or the neighboring cell is water (0), that side contributes 1 to the island perimeter.
The perimeter variable accumulates those contributions for every land cell.
After all cells are checked, perimeter holds the total island perimeter (should be returned).
 */