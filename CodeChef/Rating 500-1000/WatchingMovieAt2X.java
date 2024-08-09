// Watching Movies at 2x
// Chef started watching a movie that runs for a total of X minutes.

// Chef has decided to watch the first Y minutes of the movie at twice the usual speed as he was warned by his friends that the movie gets interesting only after the first Y minutes.

// How long will Chef spend watching the movie in total?

// Note: It is guaranteed that Y is even.


import java.lang.*;
import java.util.*;

class WatchingMovieAt2X
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int X = sc.nextInt();
	    int Y = sc.nextInt();
	    System.out.println(Y/2+(X-Y));
	}
}
