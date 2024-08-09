// Two Dishes

// Chef will have N guests in his house today. He wants to serve at least one dish to each of the N guests. Chef can make two types of dishes. He needs one fruit and one vegetable to make the first type of dish and one vegetable and one fish to make the second type of dish. Now Chef has A fruits, B vegetables, and C fishes in his house. Can he prepare at least N dishes in total?

import java.lang.*;
import java.util.*;

class TwoDishes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		    int N = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    if(N<=B && N<=(A+C)){
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}
	}
}
