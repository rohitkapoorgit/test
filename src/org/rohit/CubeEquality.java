package org.rohit;
//O(n2)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CubeEquality {
	
	public void positiveCube(int n){
		
		Map<Double,List<List<Integer>>> m = new LinkedHashMap<>();
		for(int a=1;a<=n;a++){
			
			for(int b=1;b<=n;b++){
				
				double result = Math.pow(a, 3) + Math.pow(b, 3);
				if(!m.containsKey(result)){
					
					m.put(result, new ArrayList<List<Integer>>());
					//m.get(result).add(Arrays.asList(a,b));
					//if(a==b){
						
						//m.get(result).add(Arrays.asList(a,b));
					//}
				}
				
				//else{
					
					//ArrayList<Integer> l = m.get(result);
					//System.out.println(a + "," + b + "," + l.get(0) + "," + l.get(1));
					//m.get(result).add(Arrays.asList(a,b));
				//}
				
				m.get(result).add(Arrays.asList(a,b));
				if(a==b){
					
					m.get(result).add(Arrays.asList(a,b));
				}
				
			}
		}
		
		for(Double key:m.keySet()){
			
			for(List<Integer> l1:m.get(key)){
				
				for(Integer l2:l1){
					
					System.out.print(l2 + " ");
				}
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args){
		
		CubeEquality test = new CubeEquality();
		test.positiveCube(10);
	}

}
