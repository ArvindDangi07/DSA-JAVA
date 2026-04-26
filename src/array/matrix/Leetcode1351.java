package array.matrix;

import java.util.Arrays;

public class Leetcode1351 {


        public int countNegatives(int[][] grid) {
            int count = 0;

            for(int i = 0;i<grid.length;i++){
                for(int j = 0;j<grid[0].length;j++){
                    if(grid[i][j]<0){
                        count++;
                    }
                }
            }
            return count;

        }
    public static void main(String[] args) {
            int[][] grid = {
                    {-1,3,-6},
                    {3,5,-8},
                    {1,-4,6}

            };
            Leetcode1351 leetcode1351 = new Leetcode1351();
        System.out.println((leetcode1351.countNegatives(grid)));
    }
}
