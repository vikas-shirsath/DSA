// The Cooler Dilemma 2
// The summer is at its peak in Chefland. Chef is planning to purchase a water cooler to keep his room cool. He has two options available:

// Rent a cooler at the cost of X coins per month.
// Purchase a cooler for Y coins.
// Chef wonders what is the maximum number of months for which he can rent the cooler such that the cost of renting is strictly less than the cost of purchasing it.

import java.lang.*;
import java.util.*;

class CoolerDilemma2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X>Y || X==Y) {
                System.out.println(0);
            } else {
                System.out.println((Y-1)/X);
            }
        }
	}
}