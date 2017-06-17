package org.rohit;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDupList {
	
	public List<Integer> removeDup(List<Integer> l){
		
		//List<Integer> result = new ArrayList<>();
		Set<Integer> s = new LinkedHashSet<>();
		for(int i=0;i<l.size();i++){
			
			s.add(l.get(i));
		}
		
		l = new LinkedList<Integer>();
		//result.addAll(s);
	    l.addAll(s);
		//return result;
	    return l;
		
	}
	
	public static void main(String[] args){
		
		RemoveDupList test = new RemoveDupList();
		List<Integer> a = Arrays.asList(1,2,3,3,3,4,4,6);
		System.out.println(test.removeDup(a).toString());
	}

}
