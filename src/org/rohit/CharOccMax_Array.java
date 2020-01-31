package org.rohit;

public class CharOccMax_Array {
	
	public char getMaxOccuringChar(String str)
    {
		str = str.replaceAll(" *","");
        int[] count = new int[128];
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        int max = -1;
        char result = ' ';
        //If we need to output per 1st occurrence in String
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        
        //If we need to output per smaller ASCII value
        int max1 = -1;  
        char result1 = ' ';
        for(int j=0;j<127;j++){
        	
        	if(max1<count[j]){
        		
        		max1 = count[j];
        		result1 = (char)j;
        	}
        }
      
        return result1;
    }
	
	public static void main(String[] args){
		
		CharOccMax_Array test = new CharOccMax_Array();
		//System.out.println(test.getMaxOccuringChar("Dog is an animal "));
		System.out.println(test.getMaxOccuringChar("gteiwwtdsfgd"));
		
	}

}
