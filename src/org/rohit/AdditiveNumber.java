package org.rohit;

public class AdditiveNumber {
	
	public boolean additive(String n){
		
		int length = n.length();
		for(int i=1; i<length-1; i++){
			
			for(int j=i+1; j<length; j++){
				
				if(isAdditive(n.substring(0, i), n.substring(i, j), n.substring(j))){
					
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean isAdditive(String a, String b, String c){
		
		if(!isValid(a)||!isValid(b)){
			
			return false;
		}
		
		String actualSum = add(a,b);
		
		if(actualSum.equals(c)){
			
			return true;
		}
		
		else if(!c.startsWith(actualSum)){
//		else if(!(c.indexOf(actualSum)==0)){ Can use this also	
			
			return false;
		}
		
		else{
			
			return isAdditive(b,actualSum,c.substring(actualSum.length()));
		}
	}
	
	public boolean isValid(String x){
		
		if(x.length()>1 && x.charAt(0)=='0'){
			
			return false;
		}
		
		return true;
	}
	
	public String add(String a, String b){
		
		return String.valueOf((Integer.parseInt(a) + Integer.parseInt(b)));
	}
	
	public static void main(String[] args){
		
		AdditiveNumber test = new AdditiveNumber();
		System.out.println(test.additive("112358"));
		System.out.println(test.additive("199100199"));
		System.out.println(test.additive("235813"));
		System.out.println(test.additive("12345678"));
		System.out.println(test.additive("1234235"));
		System.out.println(test.additive("12342351"));
	}

}
