package org.rohit;

import java.util.Stack;

//Using 2 for loops, find substring and then pass to valid parentheses func to validate.
//Would be O(n3)
public class LongestValidParentheses {
	
	public int lengthOfLongValidPar(String s){
		Stack<Integer> st = new Stack<>();
		st.push(-1);//otherwise () case would fail
		int l = 0;
		for(int i=0;i<s.length();i++){
			
			if(s.charAt(i)=='('){
				
				st.push(i);
			}
			
			else if(s.charAt(i)==')'){
				
				st.pop();
				if(st.empty()){
					st.push(i);
				}
				else{
					l = Math.max(i-st.peek(),l);
					
				}
			}
			
			else{
				
				return 0;
			}
		}
		
		return l;
		
	}
	
	public static void main(String[] args){
		
		LongestValidParentheses test = new LongestValidParentheses();
		System.out.println(test.lengthOfLongValidPar("(){[}]"));
		System.out.println(test.lengthOfLongValidPar(")()())"));
		System.out.println(test.lengthOfLongValidPar(")"));
		System.out.println(test.lengthOfLongValidPar("("));
		System.out.println(test.lengthOfLongValidPar("()"));
	}
	
}
