import java.lang.*;
import java.util.*;

class SmallFactorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		    int n = sc.nextInt();
		    int y = 1;
		    while(n!=1) {
		        y=y*n;
		        n=n-1;
		    }
            System.out.println(y);
		}
	}
}