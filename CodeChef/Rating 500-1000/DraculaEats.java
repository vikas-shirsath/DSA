// Dracula Eats
// Eat, drink, and be scary

// There are N spooky days left until Halloween.
// Dracula dines at a mysterious restaurant that changes its spooky menu daily. He particularly enjoys what they serve on Tuesday.

// Today is Monday, so he wishes to calculate how many times he can indulge in his favourite menu in the next N days (including today) before Halloween.

// Note that Dracula follows the standard 7-day calendar, with Tuesday immediately following Monday.


import java.lang.*;
import java.util.*;

class DraculaEats
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int N = sc.nextInt();
            System.out.println((int)Math.ceil((N-1)/7.0));
        }
	}
}