package org.rohit;
//O(n) bec. lookup in map is considered O(1)
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TwoNumberSumArrayIndices {
	
	public List<List<Integer>> indicesSum(int[] a, int sum){
		
		Map<Integer, Integer> m = new LinkedHashMap<>();
		List<List<Integer>> l = new LinkedList<>();
		for(int i=0;i<a.length;i++){
			
			int target = sum-a[i];
			if(!m.containsKey(target)){
				
				m.put(a[i], i);
			}
			
			else{
				
				l.add(Arrays.asList(m.get(target),i));
			}
		}
		
		return l;
	}
	
	public static void main(String[] args){
		
		TwoNumberSumArrayIndices test = new TwoNumberSumArrayIndices();
		int[] a = {1,5,3,7,8,4,2,3};
		System.out.println(test.indicesSum(a, 6).toString());
		
	}

}
