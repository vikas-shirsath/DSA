// Sugarcane Juice Business
// While Alice was drinking sugarcane juice, she started wondering about the following facts:
// The juicer sells each glass of sugarcane juice for 50 coins.
// He spends 20% of his total income on buying sugarcane.
// He spends 20% of his total income on buying salt and mint leaves.
// He spends 30% of his total income on shop rent.
// Alice wonders, what is the juicer's profit (in coins) when he sells N glasses of sugarcane juice?

import java.lang.*;
import java.util.*;

class SugarJuiceBussiness
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.println(15 * N);
        }
	}
}