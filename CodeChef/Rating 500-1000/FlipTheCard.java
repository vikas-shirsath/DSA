// Flip the cards
// There are N cards on a table, out of which X cards are face-up and the remaining are face-down.

// In one operation, we can do the following:

// Select any one card and flip it (i.e. if it was initially face-up, after the operation, it will be face-down and vice versa)
// What is the minimum number of operations we must perform so that all the cards face in the same direction (i.e. either all are face-up or all are face-down)?

import java.lang.*;
import java.util.*;

class FlipTheCard
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int diff = N - X;
            if(diff > X) {
                System.out.println(X);              
            } else {
                System.out.println(diff);
            }
        }
	}
}