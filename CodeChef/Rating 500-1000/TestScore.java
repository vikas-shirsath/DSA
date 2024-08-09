// Test Score
// In a test, there are N problems, each carrying X marks.
// In each problem, Chef either received X marks or 0 marks.
// Determine whether is it possible for Chef to achieve exactly Y marks.

import java.lang.*;
import java.util.*;

class TestScore
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(Y%X==0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
	}
}