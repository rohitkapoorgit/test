package org.rohit;

public class BullsCows {
	
	public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        int[] index = new int[10]; 
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
            	index[secret.charAt(i) - '0']++;
                if (index[secret.charAt(i) - '0'] <= 0){
                	
                	cows++;
                }
                index[guess.charAt(i) - '0']--;
                if (index[guess.charAt(i) - '0'] >= 0){
                	
                	cows++;
                }
            }
        }
        return bulls + "A" + cows + "B";
    }
	
	public static void main(String[] args){
		
		BullsCows test = new BullsCows();
		System.out.println(test.getHint("1807", "7810"));
		System.out.println(test.getHint("1123", "0111"));
		System.out.println(test.getHint("347985", "166210"));	
		
	}

}
