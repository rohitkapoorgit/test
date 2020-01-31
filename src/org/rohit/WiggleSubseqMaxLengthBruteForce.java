package org.rohit;

public class WiggleSubseqMaxLengthBruteForce {
	
	public int maxLength(int[] nums){
		
		if (nums.length < 2)
            return nums.length;
        return 1 + Math.max(calculate(nums, 0, true), calculate(nums, 0, false));
	}
	
	private int calculate(int[] nums, int index, boolean isUp) {
        int maxcount = 0;
        for (int i = index + 1; i < nums.length; i++) {
            if ((isUp && nums[i] > nums[index]) || (!isUp && nums[i] < nums[index]))
                maxcount = Math.max(maxcount, 1 + calculate(nums, i, !isUp));
        }
        return maxcount;
    }
	
	public static void main(String[] args){
		
		WiggleSubseqMaxLengthBruteForce test = new WiggleSubseqMaxLengthBruteForce();
		int[] a = {1,7,4,9,2,5};
		System.out.println(test.maxLength(a));
		int[] b = {1,17,5,10,13,15,10,5,16,8};
		System.out.println(test.maxLength(b));
		int[] c = {1,2,3,4,5,6,7,8,9};
		System.out.println(test.maxLength(c));
		
	}

}
