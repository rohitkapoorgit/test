package org.rohit;

public class BuildLowestNumberByRemovingDigits {
	
	public String remove(String num, int k){
		
		if (num.length() == k)
            return "0";

        StringBuilder sb = new StringBuilder(num);

        /*We will iterate the number k times. In each iteration:
        1. Remove the digit for which the next digit is smaller.
        2. If we reach at the end then remove last digit.*/
        for (int j = 0; j < k; j++) {
            int i = 0;
            while (i < sb.length() - 1 && sb.charAt(i) <= sb.charAt(i + 1)) {
                i++;
            }
            sb.delete(i, i + 1);
        }

        //remove leading 0's
        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.delete(0, 1);
        
//        Can use this also to remove leading 0's
//        int i=0;
//        while(i<sb.length() && sb.charAt(0)=='0'){
//        	sb.delete(0,1);
//        	i++;
//        }
           

        if (sb.length() == 0) {
            return "0";
        }

        return sb.toString();
	}
	
	public static void main(String[] args){
		
		BuildLowestNumberByRemovingDigits test = new BuildLowestNumberByRemovingDigits();
		System.out.println(test.remove("1432219", 3));
		System.out.println(test.remove("10200", 1));
		System.out.println(test.remove("10", 2));
		
	}

}
