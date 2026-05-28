package string_Parsing_Simulation;

import java.util.Arrays;

public class Leetcode2418 {

    public String[] sortPeople(String[] names,
                               int[] heights) {

        for(int i = 0; i < heights.length; i++){

            for(int j = i + 1;
                j < heights.length; j++){

                // descending order
                if(heights[i] < heights[j]){

                    // swap heights
                    int tempHeight = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tempHeight;

                    // swap names
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        return names;
    }

    public static void main(String[] args) {

        String[] names =
                {"Mary", "John", "Emma"};

        int[] heights =
                {180, 165, 170};

        Leetcode2418 obj =
                new Leetcode2418();

        String[] result =
                obj.sortPeople(names, heights);

        System.out.println(
                Arrays.toString(result));
    }
}