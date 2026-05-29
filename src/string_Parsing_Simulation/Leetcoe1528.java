package string_Parsing_Simulation;

public class Leetcoe1528 {


        public String restoreString(String s,
                                    int[] indices) {

            char[] result =
                    new char[s.length()];

            for(int i = 0; i < s.length(); i++){

                result[indices[i]] =
                        s.charAt(i);
            }

            return new String(result);
        }

        public static void main(String[] args) {
            String s = "codeleet";
            int [] indices = {4,5,6,7,0,2,1,3};
            Leetcoe1528 leetcode = new Leetcoe1528();
            System.out.println(leetcode.restoreString(s, indices));
        }
}
