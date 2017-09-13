package org.rohit;

//StringUtils.countMatches("a.b.c.d", ".");
public class NumberOfDigitOne {
	
	public int digitOne(int n){
		
		int count = 0;
		for(int i=1;i<=n;i++){
			
			String s = String.valueOf(i);
			//if(s.indexOf('1')>=0){
				
			//	count++;
			//}
			
			count = count + s.length()-s.replaceAll("1", "").length();
		
		}
		
		return count;
	}
	
	public static void main(String[] args){
		
		NumberOfDigitOne test = new NumberOfDigitOne();
		System.out.println(test.digitOne(13));
	}

}
