// Bus Seat Numbering
// There is a bus with 30 seats. The seats are numbered from 1 to 30, and the numbering is as depicted in this image.


// As can be seen in the image, the bus is divided into two decks - The Lower deck, and the Upper deck, with 15 seats each. And some of the seats come as Single and some as Double. For example, Seats 1 and 2 are Double, whereas Seat 11 is a Single.

// You will be given a Seat number, and your job is to classify it as one of these 4 types:

// Lower Single
// Lower Double
// Upper Single
// Upper Double


import java.lang.*;
import java.util.*;

class BusSeatNumbering
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int N = sc.nextInt();
		    if(N<=10) {
		        System.out.println("Lower Double");
		    } else if(N>10 && N<=15) {
		        System.out.println("Lower Single");
		    } else if(N>15 && N<=25) {
		        System.out.println("Upper Double");
		    } else {
		        System.out.println("Upper Single");
		    }
		}
	}
}