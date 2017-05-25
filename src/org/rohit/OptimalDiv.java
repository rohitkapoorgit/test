package org.rohit;

public class OptimalDiv {
	
	public String optimalDivision(int[] a){
		
		if(a.length ==1){
			
			return String.valueOf(a[0]);
		}
		
		else if(a.length ==2){
			
			return a[0] + "/" + a[1]; 
		}
		
		else{
			
			StringBuilder s = new StringBuilder(a[0] + "/(" + a[1]);
			for(int i=2;i<a.length;i++){
				
				s.append("/" + a[i]);
			}
			
			s.append(")");
			return s.toString();
		}
		
	}
	
	public static void main(String[] args){
		
		OptimalDiv test = new OptimalDiv();
		int[] inp = {1000,100,10,2};
		System.out.println(test.optimalDivision(inp));
	}


}
