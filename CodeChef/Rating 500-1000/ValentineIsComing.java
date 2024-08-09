// Valentine is Coming
// Valentine's Day is approaching and thus Chef wants to buy some chocolates for someone special.

// Chef has a total of X rupees and one chocolate costs Y rupees. What is the maximum number of chocolates Chef can buy?


import java.lang.*;
import java.util.*;

class ValentineIsComing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    System.out.println(X/Y);
		}
	}
}
