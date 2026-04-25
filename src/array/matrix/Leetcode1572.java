package array.matrix;

public class Leetcode1572 {


        public int diagonalSum(int[][] mat) {
            int sum = 0;
            int n = mat.length;
            int result;
            int midrow = mat.length/2;
            int midcol = mat[0].length/2;
            for(int i = 0;i<n;i++){
                sum+=mat[i][i];
                sum+=mat[i][n-i-1];

            }
            result=sum;
            if(mat.length%2!=0 && mat[0].length%2!=0){
                result = sum - mat[midrow][midcol];
            }

            return result;

        }
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Leetcode1572 leetcode1572 = new Leetcode1572();
        System.out.println(leetcode1572.diagonalSum(mat));
    }
}
