// Maximise the Tastiness
// Chef is making a dish that consists of exactly two ingredients. He has four ingredients A,B,C and D with tastiness a,b,c, and d respectively. He can use either A or B as the first ingredient and either C or D as the second ingredient.

// The tastiness of a dish is the sum of tastiness of its ingredients. Find the maximum possible tastiness of the dish that the chef can prepare.


import java.lang.*;
import java.util.*;

class MaximiseTaste
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    int D = sc.nextInt();
		    System.out.println(Math.max(A,B)+Math.max(C,D));
		}
	}
}
