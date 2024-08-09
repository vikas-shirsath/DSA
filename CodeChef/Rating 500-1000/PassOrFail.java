// Pass or Fail
// Chef is struggling to pass a certain college course.

// The test has a total of N questions, each question carries 3 marks for a correct answer and −1 for an incorrect answer. Chef is a risk-averse person so he decided to attempt all the questions. It is known that Chef got X questions correct and the rest of them incorrect. For Chef to pass the course he must score at least P marks.

// Will Chef be able to pass the exam or not?

import java.lang.*;
import java.util.*;

class PassOrFail
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int P = sc.nextInt();
		    if(((X * 3) -(N - X)) >= P) {
		        System.out.println("Pass");
		    } else {
		        System.out.println("Fail");
		    }
		}
	}
}