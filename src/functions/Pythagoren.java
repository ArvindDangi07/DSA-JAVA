package functions;

// Q. [Write a function to check if a given triplet is a Pythagorean triplet or not.]

public class Pythagoren {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 5};
        System.out.println(pythagoren(arr));
    }
    static boolean pythagoren(int arr[]){
        int n = arr.length;

        for(int i = 0 ; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){

                    int x = arr[i] * arr[i];
                    int y = arr[j] * arr[j];
                    int z = arr[k] * arr[k];

                    if(x == y + z || y == x + z || z == x + y){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
