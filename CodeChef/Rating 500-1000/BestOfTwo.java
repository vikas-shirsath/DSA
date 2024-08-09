// Best of Two
// Alice and Bob are playing a game. Each player rolls a regular six faced dice 3 times.
// The score of a player is the sum of the values of the highest 2 rolls. The player with the highest score wins, and the game ends in a Tie if both players have the same score.

// Find the winner of the game or determine whether it is a tie.

import java.lang.*;
import java.util.*;

class BestOfTwo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
		    int A1 = sc.nextInt();
		    int A2 = sc.nextInt();
		    int A3 = sc.nextInt();
		    int B1 = sc.nextInt();
		    int B2 = sc.nextInt();
		    int B3 = sc.nextInt();
		    int A = A1+A2+A3-(Math.min(A1, Math.min(A2,A3)));
		    int B = B1+B2+B3-(Math.min(B1, Math.min(B2,B3)));
		    if(A>B) {
		        System.out.println("Alice");
		    } else if(B>A){
		        System.out.println("Bob");
		    } else {
		        System.out.println("Tie");
		    }
		}
	}
}