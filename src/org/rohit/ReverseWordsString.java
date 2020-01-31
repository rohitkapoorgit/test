package org.rohit;

public class ReverseWordsString {
	
	 public String reverseWords(String s) {
	        
		StringBuilder result = new StringBuilder();
		StringBuilder temp = new StringBuilder();
//        s = s.trim();
//        String[] arr = s.split(" ");
//        for(int i=arr.length-1;i>=0;i--){
//            
//            if(!arr[i].equals("")){
//                result.append(arr[i].trim());
//                result.append(" ");                
//            }
//            
//        }
		 for(int i=s.length()-1; i>=0; i--){
			 
			 if(s.charAt(i)!=' '){
				 
				 temp.append(s.charAt(i));
			 }
			 
			 else{
				 
				 while(i>= 0 && s.charAt(i)== ' '){
					 i--;
				 }
				 i++;
				 temp.reverse().append(" ");
				 result.append(temp);
				 temp = new StringBuilder();
			 }
		 }
		 temp.reverse().append(" ");
		 result.append(temp);
        
        return result.toString().trim();       
	        
	 }
	 
	 public static void main(String[] args){
			
		 ReverseWordsString test = new ReverseWordsString();
		 System.out.println(test.reverseWords("a good   example"));
		 System.out.println(test.reverseWords("  hello world!  "));
		 System.out.println(test.reverseWords("the sky is blue"));
	 }


}
