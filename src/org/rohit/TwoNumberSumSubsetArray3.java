package org.rohit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
//import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TwoNumberSumSubsetArray3 {
		   //String[]
	public List<List<Integer>> sumSubset(int[] array, int Sum){
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		//List<Integer> l = new ArrayList<Integer>();
		List<List<Integer>> finalList = new ArrayList<>();
		
		for(int i=0; i<array.length; i++){
			
			//l.clear();
			int target = Sum-array[i];
			if(!set.contains(target)){
				
				set.add(array[i]);
				
			}
			
			else{
				
				//l.add(0,String.valueOf(array[i]));
				//l.add(1,String.valueOf(target));
				finalList.add(Arrays.asList(array[i],target));
				//StringBuilder sb = new StringBuilder();
		        
		        //for (String c : l) {
		        	
		          //  sb.append(c).append(" ");
		            
		        //}
		        
		        //finalList.add(sb.toString());
				  //finalList.add(l);
				  //l = new ArrayList<Integer>();
							
			}
	
		}
		
		//String[] stringArray = finalList.toArray(new String[0]);
		return finalList;
	
	}
	
	public static void main(String[] args){
		
		TwoNumberSumSubsetArray3 test = new TwoNumberSumSubsetArray3();
		int[] a = {1,5,3,7,8,4,2,3};
		//for(String str : test.sumSubset(a, 6))
			//System.out.println(str);
		//System.out.println(String.valueOf(test.sumSubset(a, 6)));
		System.out.println(test.sumSubset(a, 6).toString());
		
	}
	

}
