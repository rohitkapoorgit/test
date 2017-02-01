package org.rohit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	public List<List<String>> groupAnagrams(String[] strs) {
		
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        Arrays.sort(strs);
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)){
            	
            	map.put(keyStr, new ArrayList<String>());
            }
            map.get(keyStr).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
	
	public static void main(String[] args){
		
		GroupAnagrams test = new GroupAnagrams();
		String[] array = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(String.valueOf(test.groupAnagrams(array)));
	}

}