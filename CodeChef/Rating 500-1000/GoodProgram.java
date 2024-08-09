// Good Program
// In computing, the collection of four bits is called a nibble.

// Chef defines a program as:

// Good, if it takes exactly X nibbles of memory, where X is a positive integer.
// Not Good, otherwise.
// Given a program which takes N bits of memory, determine whether it is Good or Not Good.


import java.lang.*;
import java.util.*;

class GoodProgram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		    int N = sc.nextInt();
		    if(N%4==0) {
		        System.out.println("Good");
		    } else {
		        System.out.println("Not Good");
		    }
		}
	}
}