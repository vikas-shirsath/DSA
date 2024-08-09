// Programming Languages

// Chef is a software developer, so he has to switch between different languages sometimes. Each programming language has some features, which are represented by integers here.

// Currently, Chef has to use a language with two given features A and B. He has two options --- switching to a language with two features A 1  and B 1 , or to a language with two features A 2  and B 2 . All four features of these two languages are pairwise distinct.

// Tell Chef whether he can use the first language, the second language or neither of these languages (if no single language has all the required features).


import java.lang.*;
import java.util.*;

class ProgrammingLang
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int A1 = sc.nextInt();
            int B1 = sc.nextInt();
            int A2 = sc.nextInt();
            int B2 = sc.nextInt();
            if((A==A1 || A==B1) && (B==B1 || B ==A1)) {
                System.out.println(1);
            } else if((A==A2 || A==B2) && (B==B2 || B==A2)) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
	}
}