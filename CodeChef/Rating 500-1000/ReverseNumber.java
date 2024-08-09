// Reverse The Number
// Given an Integer N, write a program to reverse it.


import java.lang.*;
import java.util.*;

class ReverseNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		    int N = sc.nextInt();
		    int X = 0;
		    while(N!=0) {
		        int l = N%10;
		        X = X*10 + l;
		        N = N/10;
		    }
		    System.out.println(X);
		}
	}
}