// Qualify the round
// In a coding contest, there are two types of problems:

// Easy problems, which are worth 1 point each 
// Hard problems, which are worth 2 points each 
// To qualify for the next round, a contestant must score at least X points. Chef solved A Easy problems and B Hard problems. Will Chef qualify or not?

import java.lang.*;
import java.util.*;

class QualifyRound
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
		    int X = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    if((A + (2 * B)) >= X) {
		        System.out.println("Qualify");
		    } else {
		        System.out.println("NotQualify");
		    }
		}

	}
}
