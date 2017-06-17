package org.rohit;

import java.util.Arrays;
//maxSoFar has largest sum of contiguous sub array
public class LargestSumContiguousSubArray {
	
	int s;
	public int[] largestSum(int[] array){
		
		int maxEndingHere = 0;int maxSoFar = 0;
		int start = 0;int end=0;
		for(int i=0;i<array.length;i++){
			
			maxEndingHere = maxEndingHere + array[i];
			if(maxEndingHere<0){
				maxEndingHere=0;
				s = i+1;
			}
			
			if(maxSoFar<maxEndingHere){
				
				maxSoFar = maxEndingHere;
				start = s;
				end = i;
			}
		}
		
		return Arrays.copyOfRange(array, start, end+1);
	}
	
	public static void main(String[] args){
		
		LargestSumContiguousSubArray test = new LargestSumContiguousSubArray();
		int[] a = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(Arrays.toString(test.largestSum(a)));
	}

}
