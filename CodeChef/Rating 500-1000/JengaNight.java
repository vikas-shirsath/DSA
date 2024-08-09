// Jenga Night
// Chef hosts a party for his birthday. There are N people at the party. All these N people decide to play Jenga.

// There are X Jenga tiles available. In one round, all the players pick 1 tile each and place it in the tower.
// The game is valid if:

// All the players have a tile in each round;
// All the tiles are used at the end.
// Given N and X, find whether the game is valid.


import java.lang.*;
import java.util.*;

class JengaNight
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    if(X%N==0) {
		        System.out.println("YES");
		    } else {
		        System.out.println("No");
		    }
		}
	}
}
