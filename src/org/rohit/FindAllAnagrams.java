package org.rohit;
//Did not understand the solution by debugging - o(n)
//Can do by finding substring and passing to Anagram finder funct - o(n2)
import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
	
	public List<Integer> anagrams(String s, String p){
		
		List<Integer> anagram = new ArrayList<>();
        if (p.length() > s.length())
            return anagram;

        int left = 0, right = 0, count = p.length();
        int[] pCounts = new int[26];
        for (int i = 0; i < p.length(); i++)
        {
            pCounts[p.charAt(i) - 'a']++;
        }

        while (right < s.length())
        {
            int rKey = s.charAt(right) - 'a';
            if (pCounts[rKey] == 0)
            {
                pCounts[s.charAt(left) - 'a']++;
                count++;
                left++;
            }
            else
            {
                pCounts[rKey]--;
                count--;
                right++;
                if (count == 0)
                    anagram.add(left);
            }
        }

        return anagram;
	}
	
	public static void main(String[] args){
		
		FindAllAnagrams test = new FindAllAnagrams();
		System.out.println(test.anagrams("cbaebabacd", "abc"));
		System.out.println(test.anagrams("abab", "ab"));		
	}


}
