package array.matrix;

public class SecondaryDiagonal {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matrix.length;

        // i + j = n - 1
        for(int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - i - 1] + " ");
        }
    }
}