package org.rohit;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TwoNumberSumSubsetArray3 {
	
	public String[] sumSubset(int[] array, int Sum){
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		List<String> l = new LinkedList<String>();
		List<String> finalList = new LinkedList<String>();
		
		for(int i=0; i<array.length; i++){
			
			l.clear();
			int target = Sum-array[i];
			if(!set.contains(target)){
				
				set.add(array[i]);
				
			}
			
			else{
				
				l.add(0,String.valueOf(array[i]));
				l.add(1,String.valueOf(target));
				StringBuilder sb = new StringBuilder();
		        
		        for (String c : l) {
		        	
		            sb.append(c).append(" ");
		            
		        }
		        
		        finalList.add(sb.toString());
							
			}
	
		}
		
		String[] stringArray = finalList.toArray(new String[0]);
		return stringArray;
	
	}
	
	public static void main(String[] args){
		
		TwoNumberSumSubsetArray3 test = new TwoNumberSumSubsetArray3();
		int[] a = {1,5,3,7,8,4,2,3};
		for(String str : test.sumSubset(a, 6))
			System.out.println(str);
		
	}
	

}
