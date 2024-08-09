// Vaccine Dates

// Chef has taken his first dose of vaccine D days ago. He may take the second dose no less than L days and no more than R days since his first dose.

// Determine if Chef is too early, too late, or in the correct range for taking his second dose.

import java.lang.*;
import java.util.*;

class VaccineDates
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
		    int D = sc.nextInt();
		    int L = sc.nextInt();
		    int R = sc.nextInt();
		    if(D<L) {
		        System.out.println("Too Early");
		    } else if(D>R) {
		        System.out.println("Too Late");
		    } else {
		        System.out.println("Take second dose now");
		    }
		}
	}
}