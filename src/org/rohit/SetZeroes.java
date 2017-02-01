package org.rohit;

import java.util.Arrays;

public class SetZeroes {
	
	public int[][] setZeroes(int[][] matrix){
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		boolean row = false;
		boolean col = false;
		for(int i=0;i<rows;i++){
			
			for(int j=0;j<cols;j++){
				
				if(matrix[i][j]==0){
					
					matrix[0][j] = 0;
					matrix[i][0] = 0;
					if(i==0){
						
						row = true;
					}
					if(j==0){
						
						col = true;
					}
				}
			}
		}
		
		for(int i=1;i<rows;i++){
			
			for(int j=1;j<cols;j++){
				
				if(matrix[0][j]==0 || matrix[i][0]==0){
					
					matrix[i][j] = 0;
				}
			}
		}
		
		if(row){
			
			for(int j=1;j<cols;j++){
				
				matrix[0][j] = 0;
			}
		}
		
		if(col){
			
			for(int i=1;i<rows;i++){
				
				matrix[i][0] = 0;
			}
		}
		
		return matrix;
		
	}
	
	public static void main(String[] args){
		
		SetZeroes test = new SetZeroes();
		int[][] a = {
				{0,2,3},
				{4,0,6},
				{0,8,9},
				{4,7,5},
		};
		System.out.println(Arrays.deepToString(test.setZeroes(a)));
	}

}
