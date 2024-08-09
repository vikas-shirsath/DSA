// Chef and Candies
// There are N children and Chef wants to give them 1 candy each. Chef already has X candies with him. To buy the rest, he visits a candy shop. In the shop, packets containing exactly 4 candies are available.

// Determine the minimum number of candy packets Chef must buy so that he is able to give 1 candy to each of the N children.


import java.lang.*;
import java.util.*;

class ChefAndCandies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    if(X>N) {
		        System.out.println(0);
		    }else if((N-X)%4==0) {
		        System.out.println((N-X)/4);
		    } else {
		        System.out.println((N-X)/4 + 1);    
		    }
		}
	}
}
