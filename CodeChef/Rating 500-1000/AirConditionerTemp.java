// Air Conditioner Temperature
// There are three people sitting in a room - Alice, Bob, and Charlie. They need to decide on the temperature to set on the air conditioner. Everyone has a demand each:

// Alice wants the temperature to be at least A degrees.
// Bob wants the temperature to be at most B degrees.
// Charlie wants the temperature to be at least C degrees.
// Can they all agree on some temperature, or not?

import java.lang.*;
import java.util.*;

class AirConditionerTemp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if(A<=B && C<=B) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
	}
}
