// Elections in Chefland
// Election season has started in Chefland and the election commission wants to know the count of eligible voters.

// There are N people in Chefland where the age of the i th  person in A i .
// Given that a person needs to be at least X years old to vote, find the number of eligible voters.

// Input Format
// The first line of input will contain a single integer T, denoting the number of test cases.
// Each test case consists of multiple lines of input.
// The first line of each test case contains two space-separated integers N and X — the number of people in Chefland, and the minimum age required for a person to vote in Chefland.
// The next line contains N space-separated integers, where the i th  integer denotes the age of the i th  person.

import java.lang.*;
import java.util.*;

class ElectionInChefLand
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = 0;
		    while(N-->0) {
		        int A = sc.nextInt();
		        if(A>=X) {
		            Y++;
		        }
		    }
		    System.out.println(Y);
		}
	}
}
