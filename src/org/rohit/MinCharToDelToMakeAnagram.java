package org.rohit;

import java.util.HashMap;
import java.util.Map;
//Could use array, fill position based on chars, and then sum the abs of positions
public class MinCharToDelToMakeAnagram {
	
public int numberNeeded(String first, String second) {
        
        Map<Character,Integer> m =new HashMap<Character,Integer>();
        int count=0;
        for(int i=0;i<first.length();i++){
            
            if(m.containsKey(first.charAt(i))){
                
                m.put(first.charAt(i),m.get(first.charAt(i))+1);
            }
            
            else{
                
                 m.put(first.charAt(i),1);
            }
        }
        
        for(int i=0;i<second.length();i++){
            
            if(m.containsKey(second.charAt(i))){
                
                m.put(second.charAt(i),m.get(second.charAt(i))-1);
            }
            
            else{
                
                 m.put(second.charAt(i),-1);
            }
        }
        
        for(Character c:m.keySet()){
            
            //if(m.get(c)!=0){
                
                count+=Math.abs(m.get(c));
            //}
        }
        
        return count;
      
    }

	public static void main(String[] args){
	
		MinCharToDelToMakeAnagram test = new MinCharToDelToMakeAnagram();
		String s1 = "fcrxzwscanmligyxyvym";
		String s2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		System.out.println(test.numberNeeded(s1,s2));
		
		String s3 = "";
		String s4 = "";
		System.out.println(test.numberNeeded(s3,s4));
	}

}
