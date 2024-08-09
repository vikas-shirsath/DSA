// Possible Victory
// Chef is playing in a T20 cricket match. In a match, Team A plays for 20 overs. In a single over, the team gets to play 6 times, and in each of these 6 tries, they can score a maximum of 6 runs. After Team A's 20 overs are finished, Team B similarly plays for 20 overs and tries to get a higher total score than the first team. The team with the higher total score at the end wins the match.

// Chef is in Team B. Team A has already played their 20 overs, and have gotten a score of R. Chef's Team B has started playing, and have already scored C runs in the first O overs. In the remaining 20−O overs, find whether it is possible for Chef's Team B to get a score high enough to win the game. That is, can their final score be strictly larger than R?


import java.lang.*;
import java.util.*;

class PossibleVictory
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int O = sc.nextInt();
		int C = sc.nextInt();
		if(R < (C + ((20 - O) * 36))) {
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}

	}
}