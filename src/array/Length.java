package array;

public class Length {

    public static void main(String[] args) {
        int [] arr = {2,4,5,2,6,1};
        System.out.println(arr.length);


        int [][] nums = new int [2][3];
        System.out.println(nums.length); // no.of row
        System.out.println(nums[0].length);
        System.out.println(nums[1].length);


    }
}
/*

# length is a final variable which applicable only on arrays.
to find size of array.

# we cant find total size of array in multidimensional  array.
but we can find in chunks;










 */