// Bath in Winters
// A geyser has a capacity of X litres of water and a bucket has a capacity of Y litres of water.

// One person requires exactly 2 buckets of water to take a bath. Find the maximum number of people that can take bath using water from one completely filled geyser...


import java.lang.*;
import java.util.*;

class BathInWinters
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    System.out.println(X/(2*Y));
		}
	}
}
