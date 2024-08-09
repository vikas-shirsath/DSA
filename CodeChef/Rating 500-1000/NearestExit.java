// Nearest Exit
// There are two exits in a bus with 100 seats:

// First exit is located beside seat number 1.
// Second exit is located beside seat number 100.
// Seats are arranged in a straight line from 1 to 100 with equal spacing between any 2 adjacent seats.

// A passenger prefers to choose the nearest exit while leaving the bus.

// Determine the exit taken by passenger sitting on seat X.

import java.lang.*;
import java.util.*;

class NearestExit
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int X = sc.nextInt();
            if(100-X>X-1) {
                System.out.println("Left");
            } else {
                System.out.println("Right");
            }
        }
    }
}