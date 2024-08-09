// Presents for Cheffina
// Chef has fallen in love with Cheffina, and wants to buy N gifts for her. On reaching the gift shop, Chef got to know the following two things:

// The cost of each gift is 1 coin.
// On the purchase of every 4 th  gift, Chef gets the 5 th  gift free of cost.
// What is the minimum number of coins that Chef will require in order to come out of the shop carrying N gifts?

import java.util.*;
import java.lang.*;
import java.io.*;

class PesentForCheffina
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++ ) {
		    int N = sc.nextInt();
		    if(N <= 4) {
	            System.out.println(N);
		    } else {
		        System.out.println(N - (N / 5));
		    }
		}

	}
}