package org.rohit;


import java.util.HashSet;
import java.util.StringTokenizer;

public class AllSubsetSum {

    private static HashSet<String> allSubsets = new HashSet<>();

    private static final String token = " ";

    public static void findTargetSumSubsets(int[] input, int target, String ramp, int index) {

        if(index > (input.length - 1)) {
            if(getSum(ramp) == target) {
                allSubsets.add(ramp);
            }
            return;
        }

        //First recursive call going ahead selecting the int at the currenct index value
        findTargetSumSubsets(input, target, ramp + input[index] + token, index + 1);
        //Second recursive call going ahead WITHOUT selecting the int at the currenct index value
        findTargetSumSubsets(input, target, ramp, index + 1);
    }

    private static int getSum(String intString) {
        int sum = 0;
        StringTokenizer sTokens = new StringTokenizer(intString, token);
        while (sTokens.hasMoreElements()) {
            sum += Integer.parseInt((String) sTokens.nextElement());
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] n =  {1,5,3,7,8,4,2,3};
        int counter = 1;
        AllSubsetSum.findTargetSumSubsets(n, 6, "", 0);
        for (String str: allSubsets) {
            System.out.println(counter + ") " + str);
            counter++;
        }
    }
}