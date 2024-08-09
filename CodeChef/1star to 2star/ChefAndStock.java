// Chef and Stock Prices
// Chef wants to buy a stock whose price was S rupees when the market opened. He will buy the stock if and only if its price is in the range [A,B]. The price of the stock has changed by C% by the time he was trying to buy the stock. Will he be able to buy the stock?


import java.lang.*;
import java.util.*;

class ChefAndStock
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		    int S = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    S = (S*(C+100))/100;
		    if(S>=A && S<=B) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}

	}
}