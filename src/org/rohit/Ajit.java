package org.rohit;
//If indices are required, use map to store array[i] and its index.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
//import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ajit {
		   //String[]
	public String sumSubset(String s){
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++){
			
			if(s.charAt(i) =='a' || s.charAt(i)=='e'){
				
				//sb.append(s.charAt(i));
				s = s.replace(String.valueOf(s.charAt(i)), "");
			}
		}
		
		//return sb.toString();
		return s;
	
	}
	
	public static void main(String[] args){
		
		Ajit test = new Ajit();


		System.out.println(test.sumSubset("abacde"));

		
	}
	

}
