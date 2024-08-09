// Is the Score Consistent
// Chef is watching a football match. The current score is A:B, that is, team 1 has scored A goals and team 2 has scored B goals. Chef wonders if it is possible for the score to become C:D at a later point in the game (i.e. team 1 has scored C goals and team 2 has scored D goals). Can you help Chef by answering his question?


import java.lang.*;
import java.util.*;

class IsScoreConsistent
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    int D = sc.nextInt();
		    System.out.println(A<=C&&B<=D?"Possible":"Impossible");
		}
	}
}