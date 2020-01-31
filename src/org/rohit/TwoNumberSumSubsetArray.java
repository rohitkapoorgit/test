package org.rohit;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
//Not good solution - see TwoNumberSumSubsetArray.3
public class TwoNumberSumSubsetArray {
	
	public void sumSubset(int[] array, int Sum){
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		List<Integer> l = new LinkedList<Integer>();
		//List<List<Integer>> finalList = new LinkedList<List<Integer>>();
		
		for(int i=0; i<array.length; i++){
			
			
			int target = Sum-array[i];
			if(!set.contains(target)){
				
				set.add(array[i]);
				
			}
			
			else{
				
				l.add(0,array[i]);
				l.add(1,target);
				//finalList.add(l);
				System.out.println(l);
		
				
			}
	
		}
		
		//Integer[] intArray = finalList.toArray(new Integer[0]);
		//return intArray;
		//return finalList;
	}
	
	public static void main(String[] args){
		
		TwoNumberSumSubsetArray test = new TwoNumberSumSubsetArray();
		int[] a = {1,5,3,7,8,4,2,3};
		test.sumSubset(a, 6); 
		
	}
	

}
