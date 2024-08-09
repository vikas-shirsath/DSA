// Building Race
// Two friends Chef and Chefina are currently on floors A and B respectively. They hear an announcement that prizes are being distributed on the ground floor and so decide to reach the ground floor as soon as possible.

// Chef can climb down X floors per minute while Chefina can climb down Y floors per minute. Determine who will reach the ground floor first (ie. floor number 0). In case both reach the ground floor together, print Both.



import java.lang.*;
import java.util.*;

class BuildingRace
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0) {
	        float A = sc.nextFloat();
	        float B = sc.nextFloat();
	        float X = sc.nextFloat();
	        float Y = sc.nextFloat();
	        if((A/X)>(B/Y)) {
	            System.out.println("Chefina");
	        } else if((A/X)<(B/Y)) {
	            System.out.println("Chef");
	        } else {
	            System.out.println("Both");
	        }
	    }
	}
}