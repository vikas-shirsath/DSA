// Minimum number of Flips
// Chef has an array A of length N consisting of 1 and −1 only.

// In one operation, Chef can choose any index (1≤i≤N) and multiply the element A i  by −1.

// Find the minimum number of operations required to make the sum of the array equal to 0. Output -1 if the sum of the array cannot be made 0.


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	// your code goes here
		int t,n;
		Scanner ref=new Scanner(System.in);
		t=ref.nextInt();
		for(int i=0;i<t;i++){
		    n=ref.nextInt();
		    
		    int sum=0;
		    int arr[]=new int[n];
		    for(int j=0;j<n;j++){
		        arr[j]=ref.nextInt();
		        sum=sum+arr[j];
		    }
		    if(sum%2==0){
		        System.out.println(Math.abs(sum/2));
		    }
		    else{
		        System.out.println(-1);
		    }
		}

        ref.close();

	}
}
