package org.rohit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
//O(n*m), n= number of strings, m= length of each string
public class GroupAnagrams {
	
	public List<List<String>> groupAnagrams(String[] strs) {
		
		if(strs==null || strs.length==0){
			
			return new ArrayList<List<String>>();
		}
        //Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		Map<String, List<String>> map = new LinkedHashMap<>();
        //Arrays.sort(strs);
        for (String s : strs) {
        	//can remove sorting - three lines
            //char[] ca = s.toCharArray();
            //Arrays.sort(ca);
            //String keyStr = String.valueOf(ca);
        	//'------------------------------------'
        	char[] c = new char[26];
        	for(int i=0;i<s.length();i++){
        		
        		c[s.charAt(i)-'a']++;
        	}
        	String keyStr = new String(c);
        	
            if (!map.containsKey(keyStr)){
            	
            	map.put(keyStr, new ArrayList<String>());
            }
            map.get(keyStr).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
	
	public static void main(String[] args){
		
		GroupAnagrams test = new GroupAnagrams();
		String[] array = {"eat", "tea", "tan", "ate", "nat", "bat","taa","aat"};
		//System.out.println(String.valueOf(test.groupAnagrams(array)));
		System.out.println(test.groupAnagrams(array).toString());
		
		String[] array1 = {};
		//System.out.println(String.valueOf(test.groupAnagrams(array)));
		System.out.println(test.groupAnagrams(array1).toString());
		
		String[] array2 = {"eat"};
		//System.out.println(String.valueOf(test.groupAnagrams(array)));
		System.out.println(test.groupAnagrams(array2).toString());
	}

}
