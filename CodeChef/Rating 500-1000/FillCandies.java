// Fill Candies
// Chef received N candies on his birthday. He wants to put these candies in some bags. A bag has K pockets and each pocket can hold at most M candies. Find the minimum number of bags Chef needs so that he can put every candy into a bag.

import java.lang.*;
import java.util.*;

class FillCandies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int M = sc.nextInt();
            if(N%(M*K)==0) {
                System.out.println(N/(M*K));
            } else {
                System.out.println((N/(M*K))+1);
            }
		}
	}
}