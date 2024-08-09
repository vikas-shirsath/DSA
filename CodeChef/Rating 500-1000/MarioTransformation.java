// Mario and Transformation
// Mario transforms each time he eats a mushroom as follows:

// If he is currently small, he turns normal.
// If he is currently normal, he turns huge.
// If he is currently huge, he turns small.
// Given that Mario was initially normal, find his size after eating X mushrooms.


import java.lang.*;
import java.util.*;

class MarioTransformation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int X = sc.nextInt();
		    int Y = X%3;
		    if(Y==0) {
		        System.out.println("Normal");
		    } else if(Y==1) {
		        System.out.println("Huge");
		    } else {
		        System.out.println("Small");
		    }
		}
	}
}
