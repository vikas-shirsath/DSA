// Degree of Polynomial
// In mathematics, the degree of polynomials in one variable is the highest power of the variable in the algebraic expression with non-zero coefficient.

// Chef has a polynomial in one variable x with N terms. The polynomial looks like 𝐴0⋅𝑥0+𝐴1⋅𝑥1+…+𝐴𝑁−2⋅𝑥𝑁−2+𝐴𝑁−1⋅𝑥𝑁−1  where 1A i−1  denotes the coefficient of the i th  term 1x i−1  for all (1≤i≤N).


import java.util.*;
import java.lang.*;
import java.io.*;

class DigreeOfPoly
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0) {
	        int N = sc.nextInt();
	        int max = 0;
	        for(int i=0; i<N; i++) {
	            int a = sc.nextInt();
	            if(a!=0) {
	                max = i;
	            }
	        }
	        System.out.println(max);
	    }
	}
}
