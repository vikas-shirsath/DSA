// Reach fast
// Chef is standing at coordinate A while Chefina is standing at coordinate B.

// In one step, Chef can increase or decrease his coordinate by at most K.

// Determine the minimum number of steps required by Chef to reach Chefina.


import java.util.*;
import java.lang.*;
import java.io.*;

class ReachFast
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int K = sc.nextInt();
		    System.out.println((int)Math.ceil(((double)Math.abs(A-B))/K));
		}
	}
}
