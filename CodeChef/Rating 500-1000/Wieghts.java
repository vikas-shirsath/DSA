// Weights
// Chef is playing with weights. He has an object weighing W units. He also has three weights each of X,Y, and Z units respectively. Help him determine whether he can measure the exact weight of the object with one or more of these weights.

// If it is possible to measure the weight of object with one or more of these weights, print YES, otherwise print NO.


import java.util.*;
import java.lang.*;
import java.io.*;

class Weights
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int W = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int Z = sc.nextInt();
		    if(W==X+Y||W==Y+Z||W==X+Z|| W==X||W==Y||W==Z|| W==X+Y+Z) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}
	}
}