// Count the Notebooks
// You know that 1 kg of pulp can be used to make 1000 pages and 1 notebook consists of 100 pages.

// Suppose a notebook factory receives N kg of pulp, how many notebooks can be made from that?

import java.lang.*;
import java.util.*;

class CountTheNoteBooks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
		int N = sc.nextInt();
		System.out.println(N*10);   
		}
	}
}