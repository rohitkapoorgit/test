package org.rohit;

public class ClosestPallindrome {
	
	public String closestPall(String s){
		
		String a = genPall(s);
		String b = "";
		String c = "";
		String p = "";
		long diff2 = Long.MAX_VALUE;
		long diff3 = Long.MAX_VALUE;
		String r = "";
		
		long diff1 = Math.abs(Long.parseLong(s) - Long.parseLong(a));
		
		//when 0 at center
		if(s.length()%2==1 && s.charAt(s.length()/2)=='0'){
			
			String temp = s.substring(0, s.length()/2 +1);
			long n = Long.parseLong(temp);
			p = String.valueOf(n-1) + s.substring((s.length()/2)+1, s.length());
			b = genPall(p);
			diff2 = Math.abs(Long.parseLong(s) - Long.parseLong(b));
		}
		
		//when 9 at center
		if(s.length()%2==1 && s.charAt(s.length()/2)=='9'){
					
			String temp = s.substring(0, s.length()/2 +1);
			long n = Long.parseLong(temp);
			p = String.valueOf(n+1) + s.substring((s.length()/2)+1, s.length());
			c = genPall(p);
			diff3 = Math.abs(Long.parseLong(s) - Long.parseLong(c));
		}
		
		if(!b.isEmpty()){
			
			r = diff1<diff2?a:b;
			
		}
		
		else if(!c.isEmpty()){
			
			r = diff1<=diff3?a:c;
		}
		
		else{
			
			r = a;
		}
		
				
		
		return r;
		
	}
	
	public String genPall(String x){
		
		String leftHalf = x.substring(0, x.length()/2);
		String mid = "";
		if(x.length()%2==1){
			
			mid = "" + x.charAt(x.length()/2);
		}
		
		String rightHalf = new StringBuilder(leftHalf).reverse().toString();
		
		return leftHalf + mid + rightHalf;
	}
	
	public static void main(String[] args){
		
		ClosestPallindrome test = new ClosestPallindrome();
		String inp = "10987";
		System.out.println(test.closestPall(inp));
	}


}
