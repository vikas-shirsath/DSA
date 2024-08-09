// No play and eating all day makes your belly fat. This happened to Chef during the lockdown. His weight before the lockdown was w 1  kg (measured on the most accurate hospital machine) and after M months of lockdown, when he measured his weight at home (on a regular scale, which can be inaccurate), he got the result that his weight was w 2  kg (w 2 >w 1 ).

// Scientific research in all growing kids shows that their weights increase by a value between x 1  and x 2kg (inclusive) per month, but not necessarily the same value each month. Chef assumes that he is a growing kid. Tell him whether his home scale could be giving correct results.

import java.lang.*;
import java.util.*;

class WeightBalance
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		    int w1 = sc.nextInt();
		    int w2 = sc.nextInt();
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int M = sc.nextInt();
		    if(((w2-w1)>=(M*x1))&&((w2-w1)<=(M*x2))) {
		        System.out.println(1);
		    } else {
		        System.out.println(0);
		    }
		}
	}
}