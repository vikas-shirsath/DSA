// CRED Coins
// For each bill you pay using CRED, you earn X CRED coins.
// At CodeChef store, each bag is worth 100 CRED coins.

// Chef pays Y number of bills using CRED. Find the maximum number of bags he can get from the CodeChef store.

import java.lang.*;
import java.util.*;

class CredPoints
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
		    int Y = sc.nextInt();
		    int X = sc.nextInt();
		    System.out.println(X*Y/100);
		}

	}
}
