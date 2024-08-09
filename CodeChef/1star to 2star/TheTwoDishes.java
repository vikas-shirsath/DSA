// The Two Dishes
// Chef prepared two dishes yesterday. Chef had assigned the tastiness T 1  and T 2 to the first and to the second dish respectively. The tastiness of the dishes can be any integer between 0 and N (both inclusive).

// Unfortunately, Chef has forgotten the values of T 1  and T 2  that he had assigned to the dishes. However, he remembers the sum of the tastiness of both the dishes - denoted by S.

// Chef wonders, what can be the maximum possible absolute difference between the tastiness of the two dishes. Can you help the Chef in finding the maximum absolute difference?

import java.lang.*;
import java.util.*;

class TheTwoDishes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
		    int N = sc.nextInt();
		    int S = sc.nextInt();
		    if(S<=N) {
		        System.out.println(S);
		    } else {
		        System.out.println(N-(S-N));
		    }
		}
	}
}