package org.rohit;
//Since strings are immutable, we can't change in place
public class ReverseVowels {
	
	public String reverse(String s){
		
		char[] arr = s.toCharArray(); 
		int i = 0;
		int j = s.length()-1;
		
		while(i<j){
			
			while(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u' && i<j){
				
				i++;
				//continue;
			}
			
			while(arr[j] != 'a' && arr[j] != 'e' && arr[j] != 'i' && arr[j] != 'o' && arr[j] != 'u' && i<j){
				
				j--;
				//continue;
			}
			
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++; j--;
			
		}
		
		return new String(arr);
	}
	
	public static void main(String[] args){
		
		ReverseVowels test = new ReverseVowels();
		System.out.println(test.reverse("hello"));
		System.out.println(test.reverse("leetcode"));
	}

}
