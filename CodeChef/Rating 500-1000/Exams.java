// Exams
// In Chefland, there are X schools, and each school has Y students.
// The year end results are in and a total of 𝑍 students passed the exams.
// Assuming that all students appeared for the exams, find whether the number of students who passed in Chefland was strictly greater than 50%.

import java.lang.*;
import java.util.*;

class Exams
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
        for (int i = 0;i < T ; i++ ) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int per = (X * Y);
            if (Z > per / 2 ) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } 
	}
}