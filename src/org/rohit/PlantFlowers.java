package org.rohit;

public class PlantFlowers {
	
	public boolean plantInFlowerBed(int[] a, int n){
		
		int count = 0;
		for(int i=0;i<a.length;i++){
			
			if(a[i]==0 && i==0 && a[i+1]==0){
				
				count+=1;
				a[i] = 1;
			}
			
			else if(a[i]==0 && i==a.length-1 && a[i-1]==0){
				
				count+=1;
				a[i] = 1;
			}
			
			else if(a[i]==0 && a[i+1]==0 && a[i-1]==0){
				
				count+=1;
				a[i] = 1;
			}
			
			if(count>=n){
				
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args){
		
		PlantFlowers test = new PlantFlowers();
	    int[] array = {1,0,0,0,0,1};
		System.out.println(test.plantInFlowerBed(array,1));
		System.out.println(test.plantInFlowerBed(array,2));
	}



}
