// Problem Category


import java.lang.*;
import java.util.*;

class ProblemCategory
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		    int x = sc.nextInt();
		    if(x>=1 && x<100) {
		        System.out.println("Easy");
		    } else if(x>=100 && x<200) {
		        System.out.println("Medium");
		    } else {
		        System.out.println("Hard");
		    }
		}
	}
}