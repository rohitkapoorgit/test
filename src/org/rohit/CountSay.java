package org.rohit;

public class CountSay {
	
	public String countAndSay(int n) {
	    	
		StringBuilder curr=new StringBuilder("1");
		StringBuilder prev;
		int count;
		char say;
		for (int i=1;i<n;i++){
			prev=curr;
		 	curr=new StringBuilder();       
		 	count=1;
		 	say=prev.charAt(0);
		 	        
		 	for (int j=1,len=prev.length();j<len;j++){
		 		if (prev.charAt(j)!=say){
		 			curr.append(count).append(say);
		 	        count=1;
		 	        say=prev.charAt(j);
		 	      }
		 	      else count++;
		 	 }
		 	 
		 	curr.append(count).append(say);
		 }	       	        
		 
		return curr.toString();
	        
	}
	
	public static void main(String[] args){
		
		CountSay test = new CountSay();
		System.out.println(test.countAndSay(5));
	}

}