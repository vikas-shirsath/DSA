// There is an ATM machine. Initially, it contains a total of K units of money. N people want to withdraw money; for each valid i, the i-th person wants to withdraw A i  units of money.

// The people come in and try to withdraw money one by one, in the increasing order of their indices. Whenever someone tries to withdraw money, if the machine has at least the required amount of money, it will give out the required amount. Otherwise, it will throw an error and not give out anything; in that case, this person will return home directly without trying to do anything else.

// For each person, determine whether they will get the required amount of money or not.


import java.lang.*;
import java.util.*;

class ATMMachine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    while(N-->0) {
		        int A = sc.nextInt();
		        if(A<=K) {
		            K-=A;
		            System.out.print(1);
		        } else {
		            System.out.print(0);
		        }
		    }
		    System.out.println();
		}
	}
}
