package com.jav8.training.interview.arrangeBallon;
//https://www.chegg.com/homework-help/questions-and-answers/re-decorating-room-balloons-friend-s-birthday-party-balloons-k-different-colors-access-inf-q86401389

//https://you.com/search?q=python%20to%20java%20converter%20online%20free
public class ArrangeBallon {
	
	static int countWays(int n, int k) {
		 
		    int c = k;
		    for (int i = 1; i < n; i++) {
		        c = (c * (k - 1)) % (int) (Math.pow(10, 9) + 7);
		    }
		    return c;
    }


	public static void main(String[] args) {
	    
	    System.out.println(countWays(2,3));
	    System.out.println(countWays(1,8));
	    System.out.println(countWays(3,1));
	}
 
}
