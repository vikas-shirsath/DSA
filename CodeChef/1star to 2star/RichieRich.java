// Richie Rich

// Chef aims to be the richest person in Chefland by his new restaurant franchise. Currently, his assets are worth A billion dollars and have no liabilities. He aims to increase his assets by X billion dollars per year.

// Also, all the richest people in Chefland are not planning to grow and maintain their current worth.

// To be the richest person in Chefland, he needs to be worth at least B billion dollars. How many years will it take Chef to reach his goal if his value increases by X billion dollars each year?

import java.lang.*;
import java.util.*;

class RichieRich
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		    int A = sc.nextInt();   //current asset
		    int B = sc.nextInt();   //need to be worth
		    int X = sc.nextInt();   //increase per year
		    //number of years
		    System.out.println((B-A)/X);
		}
	}
}