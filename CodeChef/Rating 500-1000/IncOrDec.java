// Decrement OR Increment
// Write a program to obtain a number N and increment its value by 1 if the number is divisible by 4 otherwise decrement its value by 1.


import java.lang.*;
import java.util.*;

class IncOrDec
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N%4==0) {
		    System.out.println(N+1);
		} else {
		    System.out.println(N-1);
		}
	}
}
