package org.rohit;

public class UniquePaths {
	
	public int uniPaths(int m, int n){
		
		int[][] count = new int[m][n];
		
		for(int i=0;i<=m-1;i++){
			
			for(int j=0; j<=n-1; j++){
				
				if(i==0 || j==0){
					
					count[i][j] = 1;					
				}
				
				else{
					
					count[i][j] = count[i][j-1] + count[i-1][j];
				}
			}
		}
		
		return count[m-1][n-1];
	}
	
	public static void main(String[] args){
		
		UniquePaths test = new UniquePaths();
		System.out.println(String.valueOf(test.uniPaths(4,7)));
	}

}
