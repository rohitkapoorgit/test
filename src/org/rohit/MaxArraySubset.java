package org.rohit;

import java.util.Arrays;

public class MaxArraySubset {

	public int max(int[] subsetArrayAct){
		
		Arrays.sort(subsetArrayAct);
		return subsetArrayAct[subsetArrayAct.length-1];
		
	}
	
	public static void main(String[] args){
		
		MaxArraySubset test = new MaxArraySubset();
		int[] array = {1,5,3,6,8,4,2};
		int subset = 3;
		int[] subsetArray = new int[subset];
		for(int i=0;i<array.length-1;i++){
				
			subsetArray = Arrays.copyOfRange(array, i, i + subset -1);
			int[] temp = Arrays.copyOf(subsetArray, subset-1);
			int b = test.max(subsetArray);
			System.out.println(Arrays.toString(temp) + " has max " + b);
			
		}		
        
    }
	
}
