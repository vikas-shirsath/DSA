// Cyclic Quadrilateral
// You are given the sizes of angles of a simple quadrilateral (in degrees) A, B, C and D, in some order along its perimeter. Determine whether the quadrilateral is cyclic.

// Note: A quadrilateral is cyclic if and only if the sum of opposite angles is 180 ∘.


import java.lang.*;
import java.util.*;

class CyclicQuadrilateral
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
		    if(A+C==180) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}
	}
}