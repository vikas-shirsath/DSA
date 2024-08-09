// Binary Battles
// N teams have come to participate in a competitive coding event called “Binary Battles”. It is a single-elimination tournament consisting of several rounds.

// Note: It is known that N is a power of 2.

// In one round, each team will be paired up with and compete against one of the other teams. If there are X teams before the start of a round, 2X  matches are held simultaneously during the round between 2X  pairs of teams. The winning team of each match will move on to the next round, while the losing team of each match will be eliminated. There are no ties involved. The next round will then take place in the same format between the remaining teams. The process will continue until only one team remains, which will be declared the overall winner.

// The organizers want to find the total time the event will take to complete. It is given that each round spans A minutes, and that there is a break of B minutes between every two rounds (no break after the last round).



import java.util.*;
import java.lang.*;
import java.io.*;

class BinaryBattles
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int N = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    System.out.println((A+B)*((int)(Math.log(N)/Math.log(2)))-B);
		}
	}
}