// Chef and Water Bottles
// Chef has 
// N empty bottles where each bottle has a capacity of X litres.
// There is a water tank in Chefland having K litres of water. Chef wants to fill the empty bottles using the water in the tank.

// Assuming that Chef does not spill any water while filling the bottles, find out the maximum number of bottles Chef can fill completely.


import java.lang.*;
import java.util.*;

class ChefAndWaterBottel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int K = sc.nextInt();
		    if(N*X<K) {
		        System.out.println(N);
		    } else {
		        System.out.println(K/X);
		    }
		} 
	}
}
