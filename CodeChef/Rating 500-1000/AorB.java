// A or B
// There are two problems in a contest.

// Problem A is worth 500 points at the start of the contest.
// Problem B is worth 1000 points at the start of the contest.
// Once the contest starts, after each minute:

// Maximum points of Problem A reduce by 2 points .
// Maximum points of Problem B reduce by 4 points.
// It is known that Chef requires X minutes to solve Problem A correctly and Y minutes to solve Problem B correctly.

// Find the maximum number of points Chef can score if he optimally decides the order of attempting both the problems.

import java.util.*;
import java.lang.*;
import java.io.*;

class AOrB
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int AF = ((500-(2*X))+(1000-(4*(X+Y))));
		    int BF = ((1000-(4*Y))+(500-(2*(X+Y))));
		    if(AF>BF) {
		        System.out.println(AF);
		    } else {
		        System.out.println(BF);
		    }
		}    
	}
}