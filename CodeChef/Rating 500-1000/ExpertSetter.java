// Expert Setter
// A problem setter is called an expert if at least 50% of their problems are approved by Chef.

// Munchy submitted X problems for approval. If Y problems out of those were approved, find whether Munchy is an expert or not.

/* package codechef; // don't place package name! */

import java.lang.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class ExpertSetter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		     int X = sc.nextInt(); // Number of problems submitted
            int Y = sc.nextInt(); // Number of problems approved

            double approvalPercentage = (double) Y / X * 100;
            if (approvalPercentage >= 50) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        
		}
	}
}
