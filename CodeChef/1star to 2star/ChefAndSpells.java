// Chef has three spells. Their powers are A, B, and C respectively. Initially, Chef has 0 hit points, and if he uses a spell with power P, then his number of hit points increases by P.

// Before going to sleep, Chef wants to use exactly two spells out of these three. Find the maximum number of hit points Chef can have after using the spells.



import java.lang.*;
import java.util.*;

class ChefAndSpells
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = 0;
        for(int i=0; i<T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if(A<=B && A<=C) {
                System.out.println(B+C);
            } else if(B<=A && B<=C) {
                System.out.println(A+C);
            } else {
                System.out.println(A+B);
            }
        }
	}
}
