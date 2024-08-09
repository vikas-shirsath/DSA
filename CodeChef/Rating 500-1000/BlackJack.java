// Blackjack
// Chef is playing a variant of Blackjack, where 3 numbers are drawn and each number lies between 1 and 10 (with both 1 and 10 inclusive). Chef wins the game when the sum of these 3 numbers is exactly 21.

// Given the first two numbers A and B, that have been drawn by Chef, what should be 3-rd number that should be drawn by the Chef in order to win the game?

// Note that it is possible that Chef cannot win the game, no matter what is the 3-rd number. In such cases, report −1 as the answer.


import java.lang.*;
import java.util.*;

class BlackJack
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    if(21-(A+B)<=10) {
		        System.out.println(21-(A+B));
		    } else {
		        System.out.println(-1);
		    }
		}
	}
}