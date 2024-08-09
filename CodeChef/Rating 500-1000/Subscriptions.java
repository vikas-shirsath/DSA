// Subscriptions
// A new TV streaming service was recently started in Chefland called the Chef-TV. A group of  N friends in Chefland want to buy Chef-TV subscriptions. We know that 6 people can share one Chef-TV subscription. Also, the cost of one Chef-TV subscription is X rupees. Determine the minimum total cost that the group of N friends will incur so that everyone in the group is able to use Chef-TV.


import java.lang.*;
import java.util.*;

class Subscriptions
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		
		for(int i  = 0; i < T; i++) {
            int N = sc.nextInt();
		    int X = sc.nextInt();
            System.out.println(((N + 5) / 6) * X);
		}
	}
}
