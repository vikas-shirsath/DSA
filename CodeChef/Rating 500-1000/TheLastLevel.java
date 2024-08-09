// The Last Levels
// Chef is playing a videogame, and is getting close to the end. He decides to finish the rest of the game in a single session.

// There are X levels remaining in the game, and each level takes Chef Y minutes to complete. To protect against eye strain, Chef also decides that every time he completes 3 levels, he will take a Z minute break from playing. Note that there is no need to take this break if the game has been completed.

// How much time (in minutes) will it take Chef to complete the game?

import java.lang.*;
import java.util.*;

class TheLastLevel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int Z = sc.nextInt();
		    if(X%3==0) {
		        System.out.println((X*Y)+((X/3)-1)*Z);
		    } else {
		        System.out.println((X*Y)+(X/3)*Z);
		    }
		}
	}
}
