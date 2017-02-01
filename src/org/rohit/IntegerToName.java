package org.rohit;

public class IntegerToName {
	
	String result = "";
	String[] ones = new String[]{"","one", "two","three", "four", "five", "six", "seven",
			"eight","nine"};
	
	String[] tens = new String[]{"ten", "twenty", "thirty","forty", "fifty", "sixty", "seventy", 
			"eighty","ninety"};
	
	String[] hundred = new String[]{"hundred","thousand"};
	
	String[] rem = new String[]{"ten", "eleven", "twelve","thirteen", "fourteen", "fifteen", "sixteen", 
			"seventeen","eighteen","ninteen"};
	
	public String numberName(int number){
		
		String n = String.valueOf(number);
		if(n.length() ==1){
			
			result = ones[Integer.parseInt(n)];
			
		}
		
		if(n.length() ==2){
			
			result = generateLastTwo(n);
			
		}
		
		if(n.length() ==3){
			
			result = generateFirstTwo(n.substring(0, 1)) + generateLastTwo(n.substring(1));
		}
		
		if(n.length() ==4){
			
			result = generateFirstTwo(n.substring(0, 2)) + generateLastTwo(n.substring(2));
		}
		
		return result;
			
	}
	
	public String generateFirstTwo(String s){
		
		int a = Integer.parseInt(s);
		String temp = "";
		int index = 0;
		while(a > 0){
			
			int b = a%10;
			temp = ones[b] + " " + hundred[index] + " " + temp;
			a = a/10;
			index++;
			
		}
		
		return temp;
		
	}
	
	public String generateLastTwo(String s){
		
		int a = Integer.parseInt(s);
		String temp = "";
		if(a>19){
			
			temp = tens[Integer.parseInt(s.substring(0,1))-1] + " " + ones[Integer.parseInt(s.substring(1))];
			
		}
		
		else{
			
			int sum = Integer.parseInt(s.substring(0,1)) + Integer.parseInt(s.substring(1));
			temp = rem[sum-1];
			
		}
			
		return temp;
		
	}
	
	public static void main(String[] args){
		
		IntegerToName test = new IntegerToName();
		System.out.println(test.numberName(452));
		System.out.println(test.numberName(3));
		System.out.println(test.numberName(78));
		System.out.println(test.numberName(30));
		System.out.println(test.numberName(18));
		System.out.println(test.numberName(780));
		System.out.println(test.numberName(719));
		System.out.println(test.numberName(7893));
		System.out.println(test.numberName(7850));
		System.out.println(test.numberName(4517));
		System.out.println(test.numberName(5710));
	}

}
