Recent contest problems
CodeChef recently revamped its practice page to make it easier for users to identify the next problems they should solve by introducing some new features:

Recent Contest Problems - Contains only problems from the last 2 contests
Separate Un-Attempted, Attempted, and All tabs
Problem Difficulty Rating - The Recommended dropdown menu has various difficulty ranges so that you can attempt the problems most suited to your experience
Popular Topics and Tags
Chef has been participating regularly in rated contests but missed the last two contests due to his college exams. He now wants to solve them and so he visits the practice page to view these problems.

Given a list of N contest codes, where each contest code is either START38 or LTIME108, help Chef count how many problems were featured in each of the contests.


import java.util.*;
import java.lang.*;
import java.io.*;

class ContestProblem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int N = sc.nextInt();
		    int l = 0;
		    int t = 0;
		    while(N-->0) {
		        String na = sc.next();
		        if(na.equals("START38")) {
		            t++;
		        } else {
		            l++;
		        }
		    }
		    System.out.println(t+" "+l);
		}
	}
}
