package search;

public class Leetcode704 {


        public int search(int[] nums, int target) {

            int start =  0;
            int end = nums.length-1;

            while(start<=end){
                int mid = start+ (end-start)/2;

                if(nums[mid]==target){
                    return mid;
                }else if(target<nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }
            return -1;

        }
    public static void main(String[] args) {
            int [] nums = {2,3,4,5,7,9,11};
            int target = 9;
            Leetcode704 leetcode704 = new Leetcode704();
            System.out.println(leetcode704.search(nums,target));
    }
}
