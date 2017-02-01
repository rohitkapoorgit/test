package org.rohit;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubsetArraySumWrongImplementation {
	
	public int[] sumSubset(int[] array, int Sum){
		
		List<Integer> l = new LinkedList<Integer>();
		List<Integer> finalList = new LinkedList<Integer>();
		
		
		for(int i=0; i<array.length-1;i++){
			
			for(int j=i+1; j<array.length;j++){
				
				int[] subset = Arrays.copyOfRange(array, i, j);
				if(isSum(subset,Sum)){
					
					l = IntStream.of(subset).boxed().collect(Collectors.toList());
					finalList.addAll(l);
				}
				
			}
		}
		
		return finalList.stream().mapToInt(Integer::intValue).toArray();
		
	}
	
	public boolean isSum(int[] subset, int Sum){
		
		boolean found = false;
		
		if(Arrays.stream(subset).sum() == Sum){
			
			found = true;
		}
		
		return found;
	}
	
	public static void main(String[] args){
		
		SubsetArraySumWrongImplementation test = new SubsetArraySumWrongImplementation();
		int[] a = {1,3,7,4,3,8,5,3,7,9,5};
		System.out.println(Arrays.toString(test.sumSubset(a,8)));
		
	}

}
