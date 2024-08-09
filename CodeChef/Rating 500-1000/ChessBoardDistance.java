// Chessboard Distance
// The Chessboard Distance for any two points (𝑋1,𝑌1)(X 1 ,Y 1 ) and (𝑋2,𝑌2)(X 2 ,Y 2 ) on a Cartesian plane is defined as max(∣X 1 −X 2 ∣,∣Y 1 −Y 2 ∣).You are given two points (X 1 ,Y 1 ) and (X 2 ,Y 2 ). Output their Chessboard Distance.

// Note that, ∣P∣ denotes the absolute value of integer P. For example, ∣−4∣=4 and ∣7∣=7.


import java.lang.*;
import java.util.*;

class ChessBoardDistance
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int X1 = sc.nextInt();
		    int Y1 = sc.nextInt();
		    int X2 = sc.nextInt();
		    int Y2 = sc.nextInt();
		    System.out.println(Math.max(Math.abs(X1-X2), Math.abs(Y1-Y2)));
		}
	}
}