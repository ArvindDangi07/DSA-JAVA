package array;

public class AnonymousArray {

    public static void main(String[] args) {
        sum(new int[]{2,3,4,5,6});
        //sum(new int[4]{3,5,62,6});  //cant do that;
        // sum(new int[][] {{1,3,6,7,4},{3,5,67,4}});

    }
    public static void sum(int[] arr){
        int sum = 0;
        for(int add : arr){
            sum += add;
        }
        System.out.println(sum);
    }
}

/*

# sometimes our requirement is created array without name , such type of nameless is called anonymous array;
# the main purpose is for instant use one time use;
# we can create multidimensional anonymous array;
# we cant specify the size or array


 */