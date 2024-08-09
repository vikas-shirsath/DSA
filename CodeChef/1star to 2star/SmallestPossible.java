// You are given two integers N and K. You may perform the following operation any number of times (including zero): change N to N−K, i.e. subtract K from N. Find the smallest non-negative integer value of 𝑁 you can obtain this way.


import java.lang.*;
import java.util.*;

class SmallestPossible
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    if(K==0) {
		        System.out.println(N);
		    } else {
		        System.out.println(N%K);
		    }
		}
	}
}
