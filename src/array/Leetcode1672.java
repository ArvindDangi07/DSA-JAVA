package array;

// Q. 1672. Richest Customer Wealth1672. Richest Customer Wealth

public class Leetcode1672 {

    public int maximumWealth(int[][] accounts) {
        int i, j;
        int m = accounts.length;
        int n = accounts[0].length;
        int max  = 0;


        for(i=0;i<m;i++){
            int sum = 0;

            for(j=0;j<n;j++){
                sum+=accounts[i][j];

            }
            if(sum>max){
                max=sum;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{4,5,6},{7,8,9}};
        Leetcode1672 leetcode1672 = new Leetcode1672();
        System.out.println(leetcode1672.maximumWealth(accounts));
    }
}
