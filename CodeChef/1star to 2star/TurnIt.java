// TurnIt

// Chef is playing Need For Speed. Currently, his car is running on a straight road with a velocity U metres per second and approaching a 90 ∘  turn which is S metres away from him. To successfully cross the turn, velocity of the car when entering the turn must not exceed V metres per second.

// The brakes of Chef's car allow him to slow down with a deceleration (negative acceleration) not exceeding A metres per squared second. Tell him whether he can cross the turn successfully. 

import java.lang.*;
import java.util.*;

class TurnIt
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		    int U = sc.nextInt();
		    int V = sc.nextInt();
		    int A = sc.nextInt();
		    int S = sc.nextInt();
		    if(V*V>=(U*U-2*A*S)) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}
	}
}