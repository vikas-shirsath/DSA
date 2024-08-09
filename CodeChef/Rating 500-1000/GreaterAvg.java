//Greater average

import java.util.*;
import java.lang.*;
import java.io.*;

class GreaterAvg
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		for(int i= 0; i < T; i++){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
	        int C = sc.nextInt();
		    int d = (A+B);
		    if (d > 2*C) {
		        System.out.println("Yes");
	        } else {
		        System.out.println("No");
		}   
		}
	}
}
