// Cup Finals
// It is the World Cup Finals. Chef only finds a match interesting if the skill difference of the competing teams is less than or equal to D.

// Given that the skills of the teams competing in the final are X and Y respectively, determine whether Chef will find the game interesting or not.


import java.lang.*;
import java.util.*;

class CupFinals
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int D = sc.nextInt();
		    if(D>=Math.abs(X-Y)) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}
	}
}
