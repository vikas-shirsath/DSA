//Janmansh has to submit 3 assignments for Chingari before 10 pm and he starts to do the assignments at X pm. Each assignment takes him 1 hour to complete. Can you tell whether he'll be able to complete all assignments on time or not?


import java.lang.*;
import java.util.*;

class JanmanshAssignment
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();

        
        for (int i = 0; i < T ; i++ ) {
            int X = sc.nextInt();
            if( (10-X) >= 3) {
                System.out.println("Yes");
            } else {
                System.out.println("NO");
            }
        } 
	}
}
