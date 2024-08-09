// Water Filling
// Chef has three water bottles. At any point, if at least two of them are empty, she will fill them up. But if at most one bottle is empty, she will wait, and not fill them up now.

// You are given three integers -  1 ,B 2 , and B 3 .
// If B 1 =1, it means that the first bottle is full.If B 1 =0, it means that the first bottle is empty.
// Similarly, B 2  denotes whether the second bottle is full or empty, and B 3 denotes it for the third bottle.

// Output "Water filling time", if Chef has to fill the bottles now. If not, output "Not now".

import java.lang.*;
import java.util.*;

class WaterFilling
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
		    int b1 = sc.nextInt(); //Status of bottle 1
		    int b2 = sc.nextInt(); //Status of bottle 2
		    int b3 = sc.nextInt(); //Status of bottle 3
		    System.out.println((b1+b2+b3)<2?"Water filling time":"Not now");
		}

	}
}