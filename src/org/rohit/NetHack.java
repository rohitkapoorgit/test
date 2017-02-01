package org.rohit;

import java.util.ArrayList;
import java.util.List;

public class NetHack {
	
	//method with bombs and force as input
	public String[] explode(String bombs, int force){

		List<String> chamber = new ArrayList<String>();
		int size = bombs.length();
		
		//validating bombs size as per requirement
		if(size < 1 || size > 50){
			
			System.out.println("The length of 'bombs' should be between 1 to 50 characters long but is " + size);
			//exit
			return new String[0];
			
		}
		
		//validating force as per requirement
		if(force < 1 || force > 10){
			
			System.out.println("The force should be between 1 and 10 but is " + force);
			//exit
			return new String[0];
			
		}
		
		//adding bombs input string as it is to a list
		//animation list will contain all the strings generated after each time iteration
		List<String> animation = new ArrayList<String>();
		animation.add(bombs);
		
		//creating list of '.' to denote empty list which stops the execution
		List<String> empty = new ArrayList<String>();
		for(int j=0;j<size;j++){
			
			empty.add(".");
			
		}
		
		//2 lists which contains location of left and right shrapnel 
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		
		//initializing the location with the bomb location
		left = initializeShrapnel(bombs);
		right = initializeShrapnel(bombs);
		//System.out.println(left);
		//System.out.println(right);
		
		//loop to continue iteration to generate animation until chamber has all '.' with size 
		//equal to length of the bombs string
		while(!chamber.equals(empty)){
			
			//updating location lists after each time iteration
			left = updateShrapnel(left,force,"left");
			right = updateShrapnel(right,force,"right");
			//System.out.println(left);
			//System.out.println(right);
			
			chamber = new ArrayList<String>();
			
			//positions to fill in each time iteration cannot exceed size of bombs string, hence 
			//the loop is till size of bombs string
			for(int k=0;k<size;k++){
				
				//if both left and right shrapnel contains this location, add 'X'
				if(left.contains(k) && right.contains(k) ){
					
					chamber.add(k, "X");
					
				}
				
				//if only left shrapnel contains this location, add '<'
				else if(left.contains(k) && !right.contains(k)){

					chamber.add(k, "<");
					
				}
				
				//if only right shrapnel contains this location, add '>'
				else if(!left.contains(k) && right.contains(k)){

					chamber.add(k, ">");
					
				}
				
				//if neither left nor right shrapnel contains this location, add '.'
				else if(!left.contains(k) && !right.contains(k)){

					chamber.add(k, ".");
					
				}
				
			}
			
			//converting list to String for each iteration
			StringBuilder sb = new StringBuilder();
	        
	        for (String c : chamber) {
	        	
	            sb.append(c);
	            
	        }
	        
	        //adding each iteration string to main list
	        animation.add(sb.toString());	        
			
		}
		
		//System.out.println(animation);
		//converting list to String array per requirement
		String[] stringArray = animation.toArray(new String[0]);
		return stringArray;
	
	}
	
	//method which returns location of bombs, both left and right list initialized to same locations
	public List<Integer> initializeShrapnel(String bombs){
		
		List<Integer> act = new ArrayList<Integer>();
		 		
		for(int c=0; c<=bombs.length()-1;c++){
			 
			char[] chars = bombs.toCharArray();
			if(chars[c] == 'B'){
				 
				act.add(c);
				
			}
			 
			//validating bombs string has only 'B' or '.' characters as per requirement
			 else if(chars[c] !='.'){
				 
				 System.out.println("Only '.' and 'B' are allowed as valid bomb characters but it also has " + chars[c]);
				 System.exit(0);
				 
			 }
			 
		 }
		 
		 return act;
		 
	}
	
	//method which returns locations of left and right shrapnel after each time iteration
	public List<Integer> updateShrapnel(List<Integer> exp, int force, String dir){
		
		List<Integer> next = new ArrayList<Integer>();
		
		for(int i=0;i<exp.size();i++){
			
			int a = Integer.valueOf(exp.get(i));
			//if left shrapnel, original position should be decreased by force 
			if(dir == "left"){
				
				next.add((a-force));
				
			}	
			
			//if right shrapnel, original position should be increased by force 
			else{
				
				next.add((a+force));
				
			}		
			
		 }
		
		return next;
	}
	
	//main method to test example strings
	public static void main(String[] args){
		
		NetHack test = new NetHack();
		
		String[] result1 = test.explode("..B....", 2);
		for(String str : result1)
			System.out.println(str);
		
		String[] result2 = test.explode("..B.B..B", 10);
		for(String str : result2)
			System.out.println(str);
		
		String[] result3 = test.explode("B.B.B.BB.", 2);
		for(String str : result3)
			System.out.println(str);
		
		String[] result4 = test.explode("..B.B..B", 1);
		for(String str : result4)
			System.out.println(str);
		
		String[] result5 = test.explode("..B.BB..B.B..B...", 1);
		for(String str : result5)
			System.out.println(str);
        
    }
	
}