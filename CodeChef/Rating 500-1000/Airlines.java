// Airlines
// An airline operates X aircraft every day. Each aircraft can carry up to 100 passengers.
// One day, N passengers would like to travel to the same destination. What is the minimum number of new planes that the airline must buy to carry all N passengers?

import java.lang.*;
import java.util.*;

class Airlines
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int X = sc.nextInt();
		    int N = sc.nextInt();
		    
		    int need = (N+99)/100;
		    if(X>=need) {
		        System.out.println(0);
		    } else {
		        System.out.println(need-X);   
		    }
		}
	}
}



		  //  if(N%100==0) {
		  //      System.out.println((N-(X*100))/100);   
		  //  } else if(X*100<N){
		  //      System.out.println(((N-(X*100)-(N%100))/100)+1);
		  //  } else {
		  //      System.out.println(0);
		  //  }
