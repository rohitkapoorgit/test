package org.rohit;

import java.util.Arrays;


public class TripletsSumTargetClosest {
	
	public int tripletSum(int[] array, int Target){
		
		if(array==null || array.length<3){
			
			return 0;
		}
		int result = array[0]+array[1]+array[array.length-1];
		Arrays.sort(array);
		for(int i=0; i<array.length-2; i++){
			
			int j = i+1;
			int k = array.length-1;
			
			while(j<k){
				
				int Sum = array[i] + array[j] + array[k];
				if(Sum >= Target){
					
					k--;
				}
				
				if(Sum < Target){
					
					j++;
				}
				
				if(Math.abs(Sum-Target) < Math.abs(result-Target)){
					
					result = Sum;
				}
				
					
			}
				
				
		}
		
		return result;
		
	}
	
	public static void main(String[] args){
		
		TripletsSumTargetClosest test = new TripletsSumTargetClosest();
		int[] a = {-1,2,1,-4};
		System.out.println(test.tripletSum(a, 1));
		int[] b = {-1,2,3,-4,3,3,-3,9};
		System.out.println(test.tripletSum(b, 6));
		int[] c = {-1,2};
		System.out.println(test.tripletSum(c, 6));
	}

}
