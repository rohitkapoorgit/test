package org.rohit;

public class UniquePathsObstacles {
	
	public int uniPathsObs(int[][] path){
		
		int row = path.length;
		int col = path[0].length;
		
		for(int i=0;i<=row-1;i++){
			
			for(int j=0; j<=col-1; j++){
				
				if(path[i][j] ==1){
					
					path[i][j] = 0;					
				}
				
				else if(i==0 && j==0){
					
					path[i][j] = 1;	
				}
				
				else if(i==0){
					
					path[i][j] = path[i][j-1]*1;
				}
				
				else if(j==0){
					
					path[i][j] = path[i-1][j]*1;
				}
				
				else{
					
					path[i][j] = path[i-1][j] + path[i][j-1];
					
				}
				
				
			}
		}
		
		return path[row-1][col-1];
	}
	
	public static void main(String[] args){
		
		UniquePathsObstacles test = new UniquePathsObstacles();
		int[][] array = {
		                 {0,1,0},
		                 {0,1,0},
		                 {0,0,0}
		};
		System.out.println(String.valueOf(test.uniPathsObs(array)));
	}

}
