// Chef Eren
// Chef is a very big fan of Eren Yeager.

// In the last season of Attack on Titan, there were N episodes numbered from 1 to N.
// Each even indexed episode was A minutes long and each odd indexed episode was B minutes long.

// Calculate the total duration (in minutes) of the last season.

import java.lang.*;
import java.util.*;

class ChefEren
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int even = N/2;
            int odd = N-even;
            System.out.println(even*A+odd*B);
        }
	}
}
