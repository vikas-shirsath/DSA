// The Three Topics
// The Chef has reached the finals of the Annual Inter-school Declamation contest.

// For the finals, students were asked to prepare 10 topics. However, Chef was only able to prepare three topics, numbered A, B and C — he is totally blank about the other topics. This means Chef can only win the contest if he gets the topics A, B or C to speak about.
// On the contest day, Chef gets topic X. Determine whether Chef has any chances of winning the competition.
// Print "Yes" if it is possible for Chef to win the contest, else print "No".

import java.lang.*;
import java.util.*;

class TheThreeTopics
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		if(A == X || B == X || C == X) {
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}

	}
}
