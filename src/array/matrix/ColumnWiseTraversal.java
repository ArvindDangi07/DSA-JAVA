package array.matrix;

public class ColumnWiseTraversal {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Traverse column by column
        for(int j = 0; j < matrix[0].length; j++) {   // columns
            for(int i = 0; i < matrix.length; i++) {  // rows
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}