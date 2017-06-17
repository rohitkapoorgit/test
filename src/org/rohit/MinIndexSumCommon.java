package org.rohit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class MinIndexSumCommon {
	
	public String[] minSum(String[] a, String[] b){
		
		HashMap<String,Integer> m = new HashMap<>();
		LinkedList<String> l = new LinkedList<>();
		for(int i=0;i<a.length;i++){
			
			m.put(a[i], i);
		}
		
		int minSum=Integer.MAX_VALUE;
		int sum;
		for(int j=0;j<b.length;j++){
			
			if(m.containsKey(b[j])){
				
				sum = m.get(b[j]) + j;
				if(sum<minSum){
					
					minSum = sum;
					l.clear();
					l.add(b[j]);
					
				}
				
				else if(sum==minSum){
					
					l.add(b[j]);
				}
			}
		}
		
		return l.toArray(new String[0]);
	}
	
	public static void main(String[] args){
		
		MinIndexSumCommon test = new MinIndexSumCommon();
		String[] a = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] b = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
		String[] c = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] d = {"KFC", "Shogun", "Burger King"};
		System.out.println(Arrays.toString(test.minSum(a,b)));
		System.out.println(Arrays.toString(test.minSum(c,d)));
	}

	
	

}
