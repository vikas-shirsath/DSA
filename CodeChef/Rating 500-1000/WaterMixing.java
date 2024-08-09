// Water Mixing
// Chef is setting up a perfect bath for himself. He has X litres of hot water and Y litres of cold water.
// The initial temperature of water in his bathtub is A degrees. On mixing water, the temperature of the bathtub changes as following:

// The temperature rises by 1 degree on mixing 1 litre of hot water.
// The temperature drops by 1 degree on mixing 1 litre of cold water.
// Determine whether he can set the temperature to B degrees for a perfect bath.


import java.lang.*;
import java.util.*;

class WaterMixing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    if((A+X)>=B&&B>=A) {
		        System.out.println("Yes");
		    } else if(B>=(A-Y)&&B<=A) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}
	}
}