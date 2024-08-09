// Too many Floors
// Chef and Chefina are residing in a hotel.
// There are 10 floors in the hotel and each floor consists of 10 rooms.

// You know that Chef's room number is X while Chefina's Room number is Y.
// If Chef starts from his room, find the number of floors he needs to travel to reach Chefina's room.


import java.lang.*;
import java.util.*;

class TooManyFloors
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    System.out.println(Math.abs((((X-1)/10)+1)-(((Y-1)/10)+1)));
		}
	}
}
