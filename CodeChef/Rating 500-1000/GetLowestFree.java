// Get Lowest Free
// Chef goes to the supermarket to buy some items. Luckily there's a sale going on under which Chef gets the following offer:

// If Chef buys 3 items then he gets the item (out of those 3 items) having the lowest price as free.
// For e.g. if Chef bought 3 items with the cost 6, 2 and 4, then he would get the item with cost 2 as free. So he would only have to pay the cost of the other two items which will be 6+4=10.

// Chef buys 3 items having prices A, B and C respectively. What is the amount of money Chef needs to pay?


import java.lang.*;
import java.util.*;

class GetLowestFree
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    if(A<=B && A<=C) {
		        System.out.println(B+C);   
		    } else if (B<=A && B<=C ) {
		        System.out.println(A+C);
		    } else {
		        System.out.println(B+A);
		    }
		}
	}
}