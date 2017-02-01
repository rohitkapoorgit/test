package org.rohit;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SubstringConcat {
	
	public List<Integer> stringConcat(String s, String[] l){
		
		List<Integer> list = new LinkedList<Integer>();
		Map<String,Integer> map = new HashMap<String, Integer>();
		for(String a:l){
			
			if(map.containsKey(a)){
				
				int b = map.get(a);
				map.put(a, b+1);
				
			}
			
			else{
				
				map.put(a, 1);
			}
			
		}
		
		int len = l[0].length();
		for(int j=0; j<s.length()-len*(l.length);j++){
			
			Map<String,Integer> copy = new HashMap<String, Integer>(map);
			
			for(int k=0;k<l.length;k++){
				
				String sub = s.substring(j + k*len, j + k*len + len);
				if(copy.containsKey(sub)){
					
					int val = copy.get(sub);
					if(val==1){
						
						copy.remove(sub);
					}
					else{
						
						copy.put(sub,val-1);
					}
					
					if(copy.isEmpty()){
						
						list.add(j);
						break;
					}
				}
				
				else
					
					break;
				
			}
			
		}
		
		return list;
	}
	
	public static void main(String[] args){
		
		SubstringConcat test = new SubstringConcat();
		String[] act = {"bar","foo"};
		System.out.println(test.stringConcat("barbarfoothefoobarman",act).toString());
	}

}
