package org.rohit;

import java.util.Arrays;
//Would not work for repeated elements like last example
public class LongestContinuousSubArray {
	
	public int[] longestContinuousArray(int[] a){
		int maxLength = 0;
		int start = 0;
		if(a.length==1){
			
			return a;
		}
		for(int i=0;i<a.length-1;i++){
			
			int min = a[i];
			int max = a[i];
			
			for(int j=i+1;j<a.length;j++){
				
				min = Math.min(min, a[j]);
				max = Math.max(max, a[j]);
				
				if(max-min == j-i && j-i+1 >maxLength){
					
					maxLength = j-i+1;
					start = i;
				}
			}
		}
		
		return Arrays.copyOfRange(a,start,start+maxLength);
	}
	
	public static void main(String[] args){
		
		LongestContinuousSubArray test = new LongestContinuousSubArray();
		//int[] p1 = {1,1,1,-1,2,3};
		//System.out.println(Arrays.toString(test.longestContinuousArray(p1)));
		int[] p2 = {10, 12, 11};
		System.out.println(Arrays.toString(test.longestContinuousArray(p2)));
		int[] p3 = {14, 12, 11, 20};
		System.out.println(Arrays.toString(test.longestContinuousArray(p3)));
		int[] p4 = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
		System.out.println(Arrays.toString(test.longestContinuousArray(p4)));
		int[] p5 = {1};
		System.out.println(Arrays.toString(test.longestContinuousArray(p5)));
		int[] p6 = {-1,-3};
		System.out.println(Arrays.toString(test.longestContinuousArray(p6)));
		int[] p7 = {-1,-2};
		System.out.println(Arrays.toString(test.longestContinuousArray(p7)));
		int[] p8 = {};
		System.out.println(Arrays.toString(test.longestContinuousArray(p8)));
		int[] p9 = {11,11,13};
		System.out.println(Arrays.toString(test.longestContinuousArray(p9)));
					
	}

}
