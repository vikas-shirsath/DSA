//Chef in his Office
//Recently Chef joined a new company. In this company, the employees have to work for X hours each day from Monday to Thursday. Also, in this company, Friday is called Chill Day — employees only have to work for Y hours (𝑌<𝑋)(Y<X) on Friday. Saturdays and Sundays are holidays. Determine the total number of working hours in one week.

import java.util.*;
import java.lang.*;
import java.io.*;

class CChefInOffice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    System.out.println((4 * X) + Y);
		}

	}
}
