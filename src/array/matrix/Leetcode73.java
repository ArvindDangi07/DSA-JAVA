package array.matrix;

import java.util.Arrays;

public class Leetcode73 {

    public static void main(String[] args) {
        int [][] mat = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        setZeroes(mat); // calling method
    }

    public static void setZeroes(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        // Step 1: mark rows and columns
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        // Step 2: set zeroes
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] || col[j]){
                    matrix[i][j]=0;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}