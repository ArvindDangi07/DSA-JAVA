package array.matrix;

import java.util.Arrays;

public class Leetcode867 {


        public int[][] transpose(int[][] matrix) {

            int m = matrix.length;        // rows
            int n = matrix[0].length;     // columns

            int[][] result = new int[n][m];

            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    result[j][i] = matrix[i][j];
                }
            }

            return result;
        }

        public static void main(String[] args) {
            int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
            Leetcode867 leetcode = new Leetcode867();
            int[][] result = leetcode.transpose(matrix);
            System.out.println(Arrays.deepToString(result));
        }
    }

