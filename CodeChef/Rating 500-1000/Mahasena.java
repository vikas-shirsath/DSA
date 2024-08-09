// Mahasena
// Kattapa, as you all know was one of the greatest warriors of his time. The kingdom of Maahishmati had never lost a battle under him (as army-chief), and the reason for that was their really powerful army, also called as Mahasena.

// Kattapa was known to be a very superstitious person. He believed that a soldier is "lucky" if the soldier is holding an even number of weapons, and "unlucky" otherwise. He considered the army as "READY FOR BATTLE" if the count of "lucky" soldiers is strictly greater than the count of "unlucky" soldiers, and "NOT READY" otherwise.

// Given the number of weapons each soldier is holding, your task is to determine whether the army formed by all these soldiers is "READY FOR BATTLE" or "NOT READY".

import java.lang.*;
import java.util.*;

class Mahasena
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int lucky = 0; 
	    int unlucky = 0;
	    for(int i = 0; i < N; i++) {
	        if(sc.nextInt()%2==0) {
	            lucky++;
	        } else {
	            unlucky++;
	        }
	    }
	    if(lucky>unlucky) {
	        System.out.println("READY FOR BATTLE");
	    } else {
	        System.out.println("NOT READY");
	    }

	}
}