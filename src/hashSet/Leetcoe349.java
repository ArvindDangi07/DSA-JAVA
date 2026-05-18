package hashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcoe349 {

        public int[] intersection(int[] nums1, int[] nums2) {

            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> resultSet = new HashSet<>();

            for(int n:nums1){
                set1.add(n);
            }

            for(int m : nums2){
                if(set1.contains(m)){
                    resultSet.add(m);
                }
            }

            int [] result = new int[resultSet.size()];

            int i = 0;

            for(int n : resultSet){
                result[i]=n;
                i++;
            }
            return result;



        }
    public static void main(String[] args) {
            int[] nums1 = {1,2,4,5,6,4};
            int[] nums2 = {2,4,5,6,1,2};
            Leetcoe349 leetcode = new Leetcoe349();
            int[] result = leetcode.intersection(nums1,nums2);
            System.out.println(Arrays.toString(result));

    }
}
