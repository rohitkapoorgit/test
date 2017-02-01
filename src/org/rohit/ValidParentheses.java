package org.rohit;

import java.util.Stack;

public class ValidParentheses {
	
	public boolean isValid(String s){
		
		Stack<Character> l = new Stack<Character>();
		
		for(int i=0; i<s.length();i++){
			
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
				
				l.push(s.charAt(i));
			}
			
			else if(s.charAt(i)==')' && !l.empty() && l.peek()=='('){
				
				l.pop();
			}
			
			else if(s.charAt(i)=='}' && !l.empty() && l.peek()=='{'){
				
				l.pop();
			}
			
			else if(s.charAt(i)==']' && !l.empty() && l.peek()=='['){
	
				l.pop();
			}
			
			else{
				
				return false;
			}
				
		}
		
		return l.empty();
	}
	
	public static void main(String[] args){
		
		ValidParentheses test = new ValidParentheses();
		System.out.println(test.isValid("(){[}]"));
	}
}
