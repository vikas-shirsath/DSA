// Complementary Strand in a DNA
// You are given the sequence of Nucleotides of one strand of DNA through a string S of length N. S contains the character A,T,C, and G only.

// Chef knows that:
// A is complementary to T.T is complementary to A.C is complementary to G.G is complementary to C.
// Using the string S, determine the sequence of the complementary strand of the DNA.


import java.lang.*;
import java.util.*;

class ComplementaryDNA
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0) {
	        int N = sc.nextInt();
	        String S = sc.next();
	        StringBuilder SB = new StringBuilder (' ');
	        for(int i=0; i<N; i++) {
	            if(S.charAt(i)=='A') {
	                SB.append('T');
	            } else if(S.charAt(i)== 'T') {
	                SB.append('A');
	            } else if(S.charAt(i)=='G') {
	                SB.append('C');
	            } else if(S.charAt(i)=='C') {
	                SB.append('G');
	            }
	        }
	        
	        System.out.println(SB);
	    }
	}
}
