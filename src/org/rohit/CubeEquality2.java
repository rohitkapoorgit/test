package org.rohit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class CubeEquality2 {
	
	public void positiveCube(int n){
		
		Map<Double,ArrayList<Integer>> m = new LinkedHashMap<>();
		for(int a=1;a<=n;a++){
			
			for(int b=1;b<=n;b++){
				
				for(int c=1;c<=n;c++){
					
					for(int d=1;d<=n;d++){
						
						if(Math.pow(a, 3)+Math.pow(b, 3)==Math.pow(c, 3)+Math.pow(d, 3)){
							
							System.out.println(a + " " + b + " " + c + " " + d);
						}
					}
				}
			}
		}
		
		
	}
	
	public static void main(String[] args){
		
		CubeEquality2 test = new CubeEquality2();
		test.positiveCube(10);
	}

}
