package recursion;

import java.util.Arrays;

public class ReverseArray_2Pointer {

    public static void f4(int l, int r, int[] arr) {
        if (l >= r) {
            return;
        }

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        f4(l + 1, r - 1, arr);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 2, 7};

        f4(0, arr.length - 1, arr);

        System.out.println(Arrays.toString(arr));
    }
}