// Motivation

// Chef has been searching for a good motivational movie that he can watch during his exam time. His hard disk has X GB of space remaining. His friend has N movies represented with (S i​ ,R i​ ) representing (space required, IMDB rating). Help Chef choose the single best movie (highest IMDB rating) that can fit in his hard disk.

import java.lang.*;
import java.util.*;

class Motivation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int res = 0;
		    
		    for(int j=0; j<N; j++) {
		        int S = sc.nextInt();
		        int R = sc.nextInt();
		        
		        if(X>=S && R>res) {
		            res = R;
		        }
		    }
		    
		    System.out.println(res);
		}
	}
}
