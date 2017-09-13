package org.rohit;

import java.util.Arrays;
//maxSoFar has largest sum of contiguous sub array
public class LargestSumContiguousSubArray {
	
	
	public int[] largestSum(int[] array){
		
		int s=0;
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
				end = i+1;
			}
		}
		
		return Arrays.copyOfRange(array, start, end);
	}
	
	public static void main(String[] args){
		
		LargestSumContiguousSubArray test = new LargestSumContiguousSubArray();
		int[] a = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(Arrays.toString(test.largestSum(a)));
		int[] b = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(Arrays.toString(test.largestSum(b)));
		int[] c = new int[]{2, -3, 4, -1, -2, 1, -5, -3};
		System.out.println(Arrays.toString(test.largestSum(c)));
		int[] d = new int[]{2, -3, -4, 1, 2, -1, -5, -3};
		System.out.println(Arrays.toString(test.largestSum(d)));
		int[] e = new int[]{2, -3, -4, -1, -2, -1, -5, -3};
		System.out.println(Arrays.toString(test.largestSum(e)));
		int[] e1 = new int[]{2, 3, -4, -1, -2, -1, -5, -3};
		System.out.println(Arrays.toString(test.largestSum(e1)));
		int[] f = new int[]{-2, -3, -4, -1, -2, -1, -5, -3};
		System.out.println(Arrays.toString(test.largestSum(f)));
	}

}
