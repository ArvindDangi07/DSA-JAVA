package search;

public class Leetcode1346 {
    public boolean checkIfExist(int[] arr) {

        for(int i= 0;i<arr.length;i++){
            for(int j = 0 ;j<arr.length;j++){
                if(i!=j && arr[i]==2*arr[j]){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        Leetcode1346 leetcode1346 = new Leetcode1346();
        System.out.println(leetcode1346.checkIfExist(arr));
    }
}
