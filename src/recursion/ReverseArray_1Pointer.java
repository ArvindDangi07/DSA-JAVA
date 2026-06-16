package recursion;

import java.util.Arrays;

public class ReverseArray_1Pointer {

    public static void f7(int n ,int [] arr){
        int i = arr.length;
        if(n>=arr.length/2){
            return;
        }
        int temp=arr[n];
        arr[n]=arr[i-1-n];
        arr[i-1-n]=temp;

        f7(n+1,arr);

    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        f7(0,arr);
        System.out.println(Arrays.toString(arr));
    }
}
