package array;

import java.util.Arrays;

public class ArrayElementAssingment {
    public static void main(String[] args) {

        // # case 1:
        int[] arr = new int [10];
        arr[0] = 1;
        arr[1] = 'a';
        byte b = 30;
        arr[2] =b ;
        short s = 10;
        arr[3] = s ;
        // arr[4] = 10.4 ; arr [4 ] = (int)10.3;

        System.out.println(Arrays.toString(arr));

        /*
        -> Any type which can be either promoted to declared type
         */


        // # case 2:

        Object[] obj = new Object[5];
        obj[0] = new Object();
        obj[1] = "abc";
        //   obj[2] = new Integer(10); (*)


        Number [] n = new Number[10];
        n[0] = Integer.valueOf(10);
        n[1] = Double.valueOf(3);
       // n[4] = new String("hii"); (*)

        // in java everything is child class of object so it allows either declared type of its child class object;


        // #case 3:

        Runnable [] r = new Runnable[5];
        r[0] = new Thread();
       // r[1] = new String("jai hind");

        // its implementation class object are allowed

    }
}
