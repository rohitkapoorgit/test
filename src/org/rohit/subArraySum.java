package org.rohit;

import java.util.LinkedHashMap;
import java.util.Map;

public class subArraySum {
	
	public int subArrSum(int[] a, int k){
		
		Map<Integer,Integer> m = new LinkedHashMap<Integer,Integer>();
		m.put(0, 1);
		int count = 0;
		int sum=0;
		for(int i=0;i<a.length;i++){
			
			sum=sum+a[i];
			if(m.containsKey(sum-k)){
				
				count = count + m.get(sum-k);
			}
			
			if(!m.containsKey(sum)){
				
				m.put(sum, 1);
				
			}
			
			else{
				
				m.put(sum, m.get(sum)+1);
				
			}
			
			
		}
		
		return count;
		
	}
	
	public static void main(String[] args){
		
		subArraySum test = new subArraySum();
		int[] inp = {1,1,1};int t=2;
		System.out.println(test.subArrSum(inp, t));
	}

}
