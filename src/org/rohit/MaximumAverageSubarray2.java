package org.rohit;
//Brute force - 2 loops
//O(n) in time, O(1) in space
public class MaximumAverageSubarray2 {
	
	public double findMaxAverage(int[] nums, int k) {
        double res=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        res=Math.max(res,sum/k);
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            res=Math.max(res,sum/k);
        }
        return res;
    }
	
	public static void main(String[] args){
		
		MaximumAverageSubarray2 test = new MaximumAverageSubarray2();
		int[] array = {1,12,-5,-6,50,3};
		System.out.println(test.findMaxAverage(array, 4));
	}

}
