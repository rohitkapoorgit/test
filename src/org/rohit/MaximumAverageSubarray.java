package org.rohit;
//int/int is int, so need 1.0
//O(n) in time, O(n) in space
public class MaximumAverageSubarray {
	
	public double avgSum(int[] n, int k){
		
		int[] sum = new int[n.length];
		sum[0] = n[0];
		for(int i=1;i<sum.length;i++){
			
			sum[i] = sum[i-1]+n[i];
		}
		
		double res = sum[k-1]*1.0/k;
		for(int i=k;i<sum.length;i++){
			
			res = Math.max(res,(sum[i]-sum[i-k])*1.0/k);
		}
		
		return res;
	}
	
	public static void main(String[] args){
		
		MaximumAverageSubarray test = new MaximumAverageSubarray();
		int[] array = {1,12,-5,-6,50,3};
		System.out.println(test.avgSum(array, 4));
	}

}
