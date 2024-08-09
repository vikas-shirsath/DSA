// Minimum Pizzas
// Each pizza consists of 4 slices. There are N friends and each friend needs exactly X slices.

// Find the minimum number of pizzas they should order to satisfy their appetite.

import java.lang.*;
import java.util.*;

class MinimumPizzas
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    if((X*Y)%4!=0) {
		        System.out.println(((X*Y)/4)+1);
		    } else {
		        System.out.println(((X*Y)/4));
		    }
		    
		}
	}
}