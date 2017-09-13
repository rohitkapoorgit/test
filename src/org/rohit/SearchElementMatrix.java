package org.rohit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//O(n+m) time complexity, if n=m, then O(2n), which is O(n)
//Matrix is row and column sorted

//Another variation - http://www.programcreek.com/2013/01/leetcode-search-a-2d-matrix-java/
public class SearchElementMatrix {
	
	public List<Integer> searchelement(int[][] m, int x){
		
		List<Integer> l = new LinkedList<>();
		int i=0;int j=m[0].length-1;
		while(i<m.length && j>=0){
			
			if(m[i][j] == x){
				
				l.add(i);
				l.add(j);
				return l;
			}
			
			else if(m[i][j]>x){
				
				j--;
			}
			
			else if(m[i][j]<x){
				
				i++;
			}
		}
		
		return new ArrayList<Integer>();
		
	}
	
	public static void main(String[] args){
		
		SearchElementMatrix test = new SearchElementMatrix();
		int[][] m = {{10, 20, 29, 40},
				     {15, 25, 35, 45},
				     {27, 29, 37, 48},
				     {32, 33, 39, 50}};
		
		System.out.println(test.searchelement(m,29));
		
		int[][] n = {{-20, -10, -5, -4},
			     {15, 25, 35, 45},
			     {27, 29, 37, 48},
			     {32, 33, 39, 50}};
	
	System.out.println(test.searchelement(n,-10));
		
			
	}
	

}
