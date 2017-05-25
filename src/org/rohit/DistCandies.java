package org.rohit;

import java.util.HashSet;
import java.util.Set;

public class DistCandies {
	
	public int candies(int[] c){
		
		Set<Integer> s = new HashSet<Integer>();
		for(int i:c){
			
			s.add(i);
		}
		
		return Math.min(s.size(), c.length/2);
	}
	
	 public static void main(String[] args){
			
		 DistCandies test = new DistCandies();
		 int[] in = {1,1,2,3};
		 System.out.println(test.candies(in));
	}


}
