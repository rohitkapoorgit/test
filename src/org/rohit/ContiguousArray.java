package org.rohit;

import java.util.HashMap;

public class ContiguousArray {
	
	public int contArrayLength(int[] a){
		
		HashMap<Integer,Integer> m = new HashMap<Integer, Integer>();
		m.put(0, -1);
		int count = 0;
		int maxLength = 0;
		for(int i=0;i<a.length;i++){
			
			if(a[i] ==0)
				count+=-1;
			else
				count+=1;
			
			if(m.containsKey(count))
				maxLength = Math.max(maxLength, i-m.get(count));
			else
				m.put(count, i);
		}
		
		return maxLength;
	}
	
	public static void main(String[] args){
		
		ContiguousArray test = new ContiguousArray();
		int[] inp = {0,1,0,0,1,1,0};
		System.out.println(test.contArrayLength(inp));
	}

}
