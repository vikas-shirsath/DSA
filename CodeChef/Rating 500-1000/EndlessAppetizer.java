// Endless Appetizers
// Life is a like a box of of mozzarella sticks. You never know what you're gonna get, but you can predict with 100 percent accuracy that it will be a mozzarella stick.

// Chef's colleague issued a challenge to Chef: "If you eat more than X mozzarella sticks, I'll give you 30 rupees for each extra one you eat".
// For example, if X=5 and Chef eats 8 sticks, he would receive 90 rupees because he ate 3 extra sticks.

// You know that the restaurant serves Y mozzarella sticks per plate.
// You also know that Chef received R rupees from his colleague as a result of the challenge.

// What's the maximum number of plates of mozzarella sticks that Chef could have ordered?

// Note:

// Chef won't order a new plate till he finishes eating all the sticks from the previous one.
// However, it's possible that Chef didn't finish all the sticks from the final plate he ordered.


import java.lang.*;
import java.util.*;

class EndlessAppetizer
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int R = sc.nextInt();
		    System.out.println(((R/30)+X+(Y-1))/Y);
		}
	}
}
