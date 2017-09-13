package org.rohit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
//import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TwoNumberSumSubsetArray4 {

	public int numberOfPairs(int[] a, long k) {
        Set<Long> set = new LinkedHashSet<>();
        int count = 0;
		//remove dups
        Set<Integer> setUniq = new LinkedHashSet<>();
        for(int i=0;i<a.length;i++){
        	
        	setUniq.add(a[i]);
        }
        
        //for(int i=0;i<a.length;i++){
        for(Integer z:setUniq){
            
            //Long x = new Long(a[i]);
            Long x = new Long(z);
            Long target = k-x;
            if(!set.contains(target)){
                
                set.add(x);
               
            }
            
            else{
                
                count++;
            }
        }
        
        return count;

    }

	
	public static void main(String[] args){
		
		TwoNumberSumSubsetArray4 test = new TwoNumberSumSubsetArray4();
		int[] a = {1,3,46,3,1,9,46,6,45,41,18,4,29};

		System.out.println(test.numberOfPairs(a, 47));
		
	}
	

}
