// Speed Limit Test
// Alice is driving from her home to her office which is A kilometers away and will take her X hours to reach.
// Bob is driving from his home to his office which is B kilometers away and will take him Y hours to reach.

// Determine who is driving faster, else, if they are both driving at the same speed print EQUAL.

import java.lang.*;
import java.util.*;

class SpeedLimitTest
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int X = sc.nextInt();
            int B = sc.nextInt();
            int Y = sc.nextInt();
            if((A*Y) == (B*X)) {
                System.out.println("Equal");
            } else if((A*Y) > (B*X)) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
	}
}