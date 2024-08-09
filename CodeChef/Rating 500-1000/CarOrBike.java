// Car or Bike
// Chef wants to reach home as soon as possible. He has two options:

// Travel with his BIKE which takes X minutes.
// Travel with his CAR which takes Y minutes. Which of the two options is faster or do they both take same time?


import java.lang.*;
import java.util.*;

class CarOrBike
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X < Y) {
                System.out.println("BIKE");
            } else if(Y < X) {
                System.out.println("CAR");
            } else {
                System.out.println("SAME");
            }
        }
	}
}