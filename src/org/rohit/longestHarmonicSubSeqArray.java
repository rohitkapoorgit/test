package org.rohit;

import java.util.HashMap;

public class longestHarmonicSubSeqArray {
	
	public int harmonicSub(int[] a){
		
		int l = 0;
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			
			if(!m.containsKey(a[i])){
				
				m.put(a[i], 1);
			}
			
			else{
				
				m.put(a[i], m.get(a[i])+1);
			}
		}
		
		
		for(Integer k:m.keySet()){
			int count = 0;
			if(m.containsKey(k+1)){
				
				count = m.get(k) + m.get(k+1);
			}
			
			l = Math.max(count, l);
		}
		
		return l;
		
	}
	
	public static void main(String[] args){
		
		longestHarmonicSubSeqArray test = new longestHarmonicSubSeqArray();
		int[] p1 = {1,3,2,2,5,2,3,7,2};
		System.out.println(test.harmonicSub(p1));
		
		int[] p2 = {5};
		System.out.println(test.harmonicSub(p2));
	}

}
