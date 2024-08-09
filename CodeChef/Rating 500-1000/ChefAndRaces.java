// Chef and Races
// The National Championships are starting soon. There are 4 race categories, numbered from 1 to 4, that Chef is interested in. Chef is participating in exactly 2 of these categories.

// Chef has an arch-rival who is, unfortunately, the only person participating who is better than Chef, i.e, Chef can't defeat the arch-rival in any of the four race categories but can defeat anyone else. Chef's arch-rival is also participating in exactly 
// 2
// 2 of the four categories.

// Chef hopes to not fall into the same categories as that of the arch-rival.

// Given 
// X,Y,A,B where X,Y are the races that Chef participates in, and A,B are the races that Chef's arch-rival participates in, find the maximum number of gold medals (first place) that Chef can win.


import java.lang.*;
import java.util.*;

class ChefAndRaces
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int count = 2;
		    if(X==A||X==B) {
		        count--;
		    }
		    if(Y==A||Y==B) {
		        count--;
		    }
		    System.out.println(count);
		}
	}
}