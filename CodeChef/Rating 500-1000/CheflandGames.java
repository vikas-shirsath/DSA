//Chefland Games
//In Chefland, a tennis game involves 4 referees. Each referee has to point out whether he considers the ball to be inside limits or outside limits. The ball is considered to be IN if and only if all the referees agree that it was inside limits.Given the decision of the 4 referees, help Chef determine whether the ball is considered inside limits or not.

import java.lang.*;
import java.util.*;

class CheflandGames
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            int R3 = sc.nextInt();
            int R4 =  sc.nextInt();
            if( R1 == 1 && R2 == 1 && R3 == 1 && R4 == 1 ) {
                System.out.println("IN");
            } else {
                System.out.println("Out");
            }
        }

	}
}
