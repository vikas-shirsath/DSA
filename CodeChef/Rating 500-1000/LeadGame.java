The Lead Game
The game of billiards involves two players knocking 3 balls around on a green baize table. Well, there is more to it, but for our purposes this is sufficient.

The game consists of several rounds and in each round both players obtain a score, based on how well they played. Once all the rounds have been played, the total score of each player is determined by adding up the scores in all the rounds and the player with the higher total score is declared the winner.

The Siruseri Sports Club organises an annual billiards game where the top two players of Siruseri play against each other. The Manager of Siruseri Sports Club decided to add his own twist to the game by changing the rules for determining the winner. In his version, at the end of each round, the cumulative score for each player is calculated, and the leader and her current lead are found. Once all the rounds are over the player who had the maximum lead at the end of any round in the game is declared the winner.



import java.util.*;
import java.lang.*;
import java.io.*;

class LeadGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int at = 0;
		int bt = 0;
		int maxLead = 0;
		int winner = 0;
		while(N-->0) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    at = at + A;
		    bt = bt + B;
		    int currentLead = Math.abs(at-bt);
		    if(currentLead>maxLead) {
		        maxLead = currentLead;
		        winner = (at>bt) ? 1 : 2;
		    }
		}
        System.out.println(winner+" "+ maxLead);
	}
}
