// Chef And Operators
// Chef has just started Programming, he is in first year of Engineering. Chef is reading about Relational Operators.
// Relational Operators are operators which check relationship between two values. Given two numerical values A and B you need to help chef in finding the relationship between them that is,

// First one is greater than second or, First one is less than second or, First and second one are equal.


import java.util.*;
import java.lang.*;
import java.io.*;

class ChefAndOperators
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0) {
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        if(A>B) {
	            System.out.println(">");
	        } else if(A<B) {
	            System.out.println("<");
	        } else {
	            System.out.println("=");
	        }
	    }
	}
}