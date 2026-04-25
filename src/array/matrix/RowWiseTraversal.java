package array.matrix;

public class RowWiseTraversal {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Traverse row by row
        for(int i = 0; i < matrix.length; i++) {          // rows
            for(int j = 0; j < matrix[0].length; j++) {   // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}