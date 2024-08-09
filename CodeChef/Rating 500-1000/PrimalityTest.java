// Primality Test
// Alice and Bob are meeting after a long time. As usual they love to play some math games. This times Alice takes the call and decides the game. The game is very simple, Alice says out an integer and Bob has to say whether the number is prime or not. Bob as usual knows the logic but since Alice doesn't give Bob much time to think, so Bob decides to write a computer program.

// Help Bob accomplish this task by writing a computer program which will calculate whether the number is prime or not.

// Note that 1 is not a prime number.


import java.util.*;
import java.lang.*;
import java.io.*;

class PrimalityTest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
            int N = sc.nextInt();
            boolean flag = true;
            if(N<=1) {
                flag = false;
            } else if(N==2) {
                flag = true;
            } else if (N % 2 == 0) {
                flag = false;
            } else {
                for(int i = 3; i <= Math.sqrt(N); i+=2) {
                    if(N % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
		}
	}
}