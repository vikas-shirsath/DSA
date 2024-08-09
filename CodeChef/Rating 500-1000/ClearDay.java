// Clear Day
// Chef classifies a day to be either rainy, cloudy, or clear.

// In a particular week, Chef finds X days to be rainy and 𝑌 days to be cloudy.

// Find the number of clear days in the week.

import java.lang.*;
import java.util.*;

class ClearDay
{
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		System.out.println(7 - (X + Y));

	}
}


