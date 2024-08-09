// Police and Thief
// Chef discovered that his secret recipe has been stolen. He immediately informs the police of the theft.

// It is known that the policeman and thief move on the number line. You are given that:

// The initial location of the policeman on the number line is X and his speed is 2 units per second.
// The initial location of the thief on the number line is Y and his speed is 1 unit per second.
// Find the minimum time (in seconds) in which the policeman can catch the thief. Note that, the policeman catches the thief as soon as their locations become equal and the thief will try to evade the policeman for as long as possible.

import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    System.out.println(Math.abs(Y - X));
		}

	}
}