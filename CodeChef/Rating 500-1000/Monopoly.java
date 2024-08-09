// Monopoly
// There are 4 companies in the markets of Chefland, A, B, C, and D.
// This year,
// Company A made a profit of P lakh rupees,
// Company B made a profit of Q lakh rupees,
// Company C made a profit of R lakh rupees,
// Company D made a profit of S lakh rupees.
// There is said to be a monopoly in the market if the profit made by one company is strictly greater than the sum of profits made by all other companies.
// Determine if there is a monopoly in the market or not.


import java.lang.*;
import java.util.*;

class Monopoly
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		    int P = sc.nextInt();
		    int Q = sc.nextInt();
		    int R = sc.nextInt();
		    int S = sc.nextInt();
		    if(P>Q+R+S || Q>P+R+S || R>P+Q+S || S>P+Q+R) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}
	}
}