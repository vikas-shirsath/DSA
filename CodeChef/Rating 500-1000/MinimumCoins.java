// inimum number of coins
// Chef has infinite coins in denominations of rupees 5 and rupees 10.

// Find the minimum number of coins Chef needs, to pay exactly X rupees. If it is impossible to pay X rupees in denominations of rupees 5 and 10 only, print −1.


import java.lang.*;
import java.util.*;

class MinimumCoins
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int X = sc.nextInt();
		    if(X%5==0) {
		        if(X%10==0){
		            System.out.println(X/10);
		        } else {
		            System.out.println((X-5)/10 + 1);
		        }
		    } else {
		        System.out.println(-1);
		    }
		}
	}
}