// Sale Season
// It's the sale season again and Chef bought items worth a total of X rupees. The sale season offer is as follows:

// if X≤100, no discount.
// if 100<X≤1000, discount is 25 rupees.
// if 1000<X≤5000, discount is 100 rupees.
// if X>5000, discount is 500 rupees.
// Find the final amount Chef needs to pay for his shopping.

import java.lang.*;
import java.util.*;

class SaleSeason
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
		    int X = sc.nextInt();
		    if(X<=100) {
		        System.out.println(X);
		    } else if(X>100 && X<=1000) {
		        System.out.println(X-25);
		    } else if(X>1000 && X<=5000) {
		        System.out.println(X-100);
		    } else {
		        System.out.println(X-500);
		    }
		}
	}
}