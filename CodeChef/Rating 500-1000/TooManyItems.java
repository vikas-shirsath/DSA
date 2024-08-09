// Too many items
// Chef bought N items from a shop. Although it is hard to carry all these items in hand, so Chef has to buy some polybags to store these items.
// 1 polybag can contain at most 
// 10 items. What is the minimum number of polybags needed by Chef?


import java.lang.*;
import java.util.*;

class TooManyItems
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0) {
	        int N = sc.nextInt();
	        System.out.println((N+9)/10);
	    }
	}
}
