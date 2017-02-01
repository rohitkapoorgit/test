package org.rohit;

public class RemoveDup {
	
	public int removeDuplicate(int[] a){
		
		int j = 0;
		for(int i=0;i<a.length;i++){
			
			if(a[i]!=a[j]){
				
				a[++j] = a[i];
			}
		}
		
		return ++j;
	}
	
	public static void main(String[] args){
		
		RemoveDup test = new RemoveDup();
		int[] a = new int[]{1,2,3,3,3,4,4,6};
		System.out.println(test.removeDuplicate(a));
	}

}
