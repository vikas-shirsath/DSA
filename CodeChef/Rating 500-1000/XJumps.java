// X Jumps
// Chef is currently standing at stair 0 and he wants to reach stair numbered X.

// Chef can climb either Y steps or 1 step in one move.
// Find the minimum number of moves required by him to reach exactly the stair numbered X.

import java.lang.*;
import java.util.*;

class XJumps
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    if(X%Y==0) {
		        System.out.println(X/Y);
		    } else {
		        System.out.println((X/Y)+(X%Y));
		    }
		}
	}
}
