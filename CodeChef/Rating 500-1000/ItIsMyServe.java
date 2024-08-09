// It is My Serve
// Alice and Bob are playing a game of table tennis where irrespective of the point scored, every player makes 2 consecutive serves before the service changes. Alice makes the first serve of the match. Therefore the first 2 serves will be made by Alice, then the next 2 serves will be made by Bob and so on.

import java.lang.*;
import java.util.*;

class ItIsMyServe
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int P = sc.nextInt();
		    int Q = sc.nextInt();
		    if((P+Q+1)%4==1||(P+Q+1)%4==2||(P+Q)<2) {
		        System.out.println("Alice");
		    } else {
		        System.out.println("Bob");
		    }
		}
	}
}