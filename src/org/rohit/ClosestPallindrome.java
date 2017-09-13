package org.rohit;

public class ClosestPallindrome {
	
	public String closestPall(String s){
		
		if(s==null || s.length()==0 || s.equals("0")){
			
			return "0";
		}
	
		String a = genPall(s);
		String b = "";
		String c = "";
		String p = "";
		long diff2 = Long.MAX_VALUE;
		long diff3 = Long.MAX_VALUE;
		String r = "";
		
		long diff1 = Math.abs(Long.parseLong(s) - Long.parseLong(a));
		
		//when 0 at center
		//if(s.length()%2==1 && s.charAt(s.length()/2)=='0'){
		if(s.charAt(s.length()/2)=='0'){
			
			String temp = s.substring(0, s.length()/2 +1);
			long n = Long.parseLong(temp);
			p = String.valueOf(n-1) + s.substring((s.length()/2)+1, s.length());
			b = genPall(p);
			diff2 = Math.abs(Long.parseLong(s) - Long.parseLong(b));
		}
		
		//when 9 at center
		//if(s.length()%2==1 && s.charAt(s.length()/2)=='9'){
		if(s.charAt(s.length()/2)=='9'){
					
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
		String inp1 = "1000";
		System.out.println(test.closestPall(inp1));
		String inp4 = "10000";
		System.out.println(test.closestPall(inp4));
		String inp2 = "10999";
		System.out.println(test.closestPall(inp2));
		String inp3 = "1099";
		System.out.println(test.closestPall(inp3));
		String inp5 = "9";
		System.out.println(test.closestPall(inp5));
	}


}
