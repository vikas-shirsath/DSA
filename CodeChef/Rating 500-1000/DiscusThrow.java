// Discus Throw
// In discus throw, a player is given 3 throws and the throw with the longest distance is regarded as their final score.

// You are given the distances for all 3 throws of a player. Determine the final score of the player.

import java.lang.*;
import java.util.*;

class DiscusThrow
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    if(A>=B&&A>=C) {
		        System.out.println(A);
		    } else if(B>=A&&B>=C) {
		        System.out.println(B);
		    } else {
		        System.out.println(C);
		    }
		}
	}
}
