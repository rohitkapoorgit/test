package org.rohit;

import java.util.LinkedHashMap;
import java.util.Map;
//contiguous subarray of 0 and 1 - input is binary array
public class ContiguousArray {
	
	public int contArrayLength(int[] a){
		
		Map<Integer,Integer> m = new LinkedHashMap<Integer, Integer>();
		m.put(0, -1);
		int count = 0;
		int maxLength = 0;
		for(int i=0;i<a.length;i++){
			
			if(a[i] ==0)
				count+=-1;
			else
				count+=1;
			//We could also find array start and end
			//if map has key, find length, if this length is > max, this is maxLength, and end=i, start=m.get(count) 
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
		int[] inp1 = {0};
		System.out.println(test.contArrayLength(inp1));
		int[] inp2 = {1,0};
		System.out.println(test.contArrayLength(inp2));
	}

}
