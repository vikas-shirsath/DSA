// Small Factorial
// Write a program to find the factorial value of any number entered by the user.



import java.lang.*;
import java.util.*;

class SmallFactorial2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int N = sc.nextInt();
		    long factorial = 1;
            
            for (int j = 2; j <= N; j++) {
                factorial *= j;
            }
            
            System.out.println(factorial);
		    
		}
	}
}
