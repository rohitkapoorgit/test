package org.rohit;

public class MaxProdSubArray {
	
	public int maxProduct(int[] nums) {

	    if(nums==null || nums.length==0) return 0;
	    
	    int max=nums[0];
	    int currMax=max;
	    int currMin=max;
	    
	    for(int i=1;i<nums.length;++i){
	        int tempMax = Math.max(nums[i],Math.max(currMax*nums[i], currMin*nums[i] ) );
	        int tempMin = Math.min(nums[i],Math.min(currMax*nums[i], currMin*nums[i] ) );
	         
	        currMax = tempMax;
	        currMin = tempMin;
	        
	        max = Math.max(currMax,max);
	    }
	    
	    return max;
	    
	}
	
	public static void main(String[] args){
		
		MaxProdSubArray test = new MaxProdSubArray();
		int[] a = {2,3,-2,4};
		System.out.println(test.maxProduct(a));
		int[] b = {-2,0,-1};
		System.out.println(test.maxProduct(b));
		int[] c = {-2,-6,-1};
		System.out.println(test.maxProduct(c));
	}

}
