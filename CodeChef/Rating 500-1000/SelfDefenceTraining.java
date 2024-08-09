// Self Defence Training
// After the phenomenal success of the 36th Chamber of Shaolin, San Te has decided to start 37th Chamber of Shaolin. The aim this time is to equip women with shaolin self-defence techniques.

// The only condition for a woman to be eligible for the special training is that she must be between 10 and 60 years of age, inclusive of both 10 and 60.

// Given the ages of N women in his village, please help San Te find out how many of them are eligible for the special training.


import java.lang.*;
import java.util.*;

class SelfDefenceTraining
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int count = 0;
		    int N = sc.nextInt();
		    while(N-->0) {
		        int A = sc.nextInt();
		        if(A>=10&&A<=60) {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}