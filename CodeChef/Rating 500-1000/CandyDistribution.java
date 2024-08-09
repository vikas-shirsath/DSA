// Candy Distribution
// Chef has N candies. He has to distribute them to exactly M of his friends such that each friend gets equal number of candies and each friend gets even number of candies. Determine whether it is possible to do so.

// NOTE: Chef will not take any candies himself and will distribute all the candies.


import java.lang.*;
import java.util.*;

class CandyDistribution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    if((N/M)%2==0&&N%M==0) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}
	}
}
