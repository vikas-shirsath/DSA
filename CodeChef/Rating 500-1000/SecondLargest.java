// Second Largest
// Three numbers A, B and C are the inputs. Write a program to find second largest among them.


import java.lang.*;
import java.util.*;

class SecondLargest
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0) {
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int C = sc.nextInt();
	        int min = Math.min(A,Math.min(B,C));
	        int max = Math.max(A,Math.max(B,C));
	        System.out.println((A+B+C)-(min+max));       
	    }
	}
}