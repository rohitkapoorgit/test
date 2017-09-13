package org.rohit;

import java.util.Arrays;

public class LongestPositiveSubArray {
	
	public int[] longestPositiveArray(int[] a){
		
		int start = 0;//int end = 0;
		int i=0;int j=0;int maxLength=0;
		while(i<a.length){
			
			if(a[i]>0){
				
				i++;
			}
				
			if(i-j>maxLength){
				
					//end = i;
					start = j;
					maxLength = i-j;
			}
				
			while(i<a.length && a[i]<0){
					
					i++;
					j=i;
			}
			
		}
		
		//return Arrays.copyOfRange(a, start, end);
		return Arrays.copyOfRange(a, start, start+maxLength);
	}
	
	public static void main(String[] args){
		
		LongestPositiveSubArray test = new LongestPositiveSubArray();
		int[] p1 = {1,1,1,-1,2,3};
		System.out.println(Arrays.toString(test.longestPositiveArray(p1)));
		int[] p2 = {1,1,1,-1,2,3,4,5,4};
		System.out.println(Arrays.toString(test.longestPositiveArray(p2)));
		int[] p3 = {1,1,1,-1,-2,3,-4,5,-4,6 ,3, 9, 5};
		System.out.println(Arrays.toString(test.longestPositiveArray(p3)));
		int[] p4 = {1,1,1,4,2,-1,-2,3,-4,5,-4,6 ,3, 9, 5};
		System.out.println(Arrays.toString(test.longestPositiveArray(p4)));
		int[] p5 = {-1,3,8};
		System.out.println(Arrays.toString(test.longestPositiveArray(p5)));
		int[] p6 = {1,1,1,4,-5};
		System.out.println(Arrays.toString(test.longestPositiveArray(p6)));
		int[] p7 = {1};
		System.out.println(Arrays.toString(test.longestPositiveArray(p7)));
		int[] p8 = {-1,-3};
		System.out.println(Arrays.toString(test.longestPositiveArray(p8)));
		int[] p9 = {-1};
		System.out.println(Arrays.toString(test.longestPositiveArray(p9)));
		int[] p10 = {-1,1,1,-1,-2,3,-4,5,5,6,7,3,-4,6 ,3, 9, 5};
		System.out.println(Arrays.toString(test.longestPositiveArray(p10)));
		int[] p11 = {-1,1,1,-1,-2,3,-4,5,5,6,7,3,-4,5,3,2,-2,6 ,3, 9, 5};
		System.out.println(Arrays.toString(test.longestPositiveArray(p11)));
		int[] p12 = {-1,5};
		System.out.println(Arrays.toString(test.longestPositiveArray(p12)));
		int[] p13 = {4,-1};
		System.out.println(Arrays.toString(test.longestPositiveArray(p13)));
	}
}
