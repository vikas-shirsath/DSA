// Minimum Cars required
// A single car can accommodate at most 4 people.

// N friends want to go to a restaurant for a party. Find the minimum number of cars required to accommodate all the friends.

import java.lang.*;
import java.util.*;

class MinimumCarsRequired
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int N = sc.nextInt();
		    if(N%4==0) {
		        System.out.println(N/4);
		    } else {
		        System.out.println(N/4+1);
		    }
		}
	}
}