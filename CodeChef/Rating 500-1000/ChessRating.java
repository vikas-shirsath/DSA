// Chess Ratings
// Alice has recently started playing Chess. Her current rating is X. She noticed that when she wins a game, her rating increases by 8 points.

// Can you help Alice in finding out the minimum number of games she needs to win in order to make her rating greater than or equal to Y?


import java.lang.*;
import java.util.*;

class ChessRating
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		   int X = sc.nextInt();
		   int Y = sc.nextInt();
		   if((Y-X)%8==0) {
		       System.out.println((Y-X)/8);
		   } else {
		       System.out.println((Y-X)/8+1);
		   }
		}
	}
}