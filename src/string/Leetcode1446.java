package string;

public class Leetcode1446 {


        public int maxPower(String s) {

            int count = 1;
            int max = 1;

            for(int i = 1; i < s.length(); i++){

                if(s.charAt(i)
                        ==
                        s.charAt(i-1)){

                    count++;
                }
                else{

                    max = Math.max(max, count);

                    count = 1;
                }
            }

            // last group
            max = Math.max(max, count);

            return max;
        }
    public static void main(String[] args) {
            String str = "Leetcode";
            Leetcode1446 leetcode1446 = new Leetcode1446();
            System.out.println(leetcode1446.maxPower(str));
    }
}
