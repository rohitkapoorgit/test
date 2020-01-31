package org.rohit;

public class RangeSumUsingCaching {
	
	private int[] cumSum;
	
	public RangeSumUsingCaching(int[] arr){
		
		cumSum = new int[arr.length];
		
		cumSum[0] = arr[0];
		for(int i=1; i<arr.length; i++){
			
			cumSum[i] = cumSum[i-1] + arr[i];
		}		
		
	}
	
	public int sumRange(int i, int j){
		
		if(i==0){
			
			return cumSum[j];
			
		}
		
		else{
			
			return cumSum[j] - cumSum[i-1];
		}
	}
	
	
	
	public static void main(String[] args){
		
		int[] p1 = {-2, 0, 3, -5, 2, -1};
		RangeSumUsingCaching test = new RangeSumUsingCaching(p1);		
		System.out.println(test.sumRange(0,2));
		System.out.println(test.sumRange(2,5));
		System.out.println(test.sumRange(0,5));
	}

}
