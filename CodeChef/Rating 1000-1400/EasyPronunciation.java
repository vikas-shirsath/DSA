import java.util.*;
import java.lang.*;
import java.io.*;

class EasyPronunciation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
		    int N = sc.nextInt();
		    sc.nextLine();
		    String S = sc.nextLine();
		    int count = 0;
		    for(int j = 0; j<N; j++) {
		        if(S.charAt(j) == 'a' || S.charAt(j) == 'e' || S.charAt(j) == 'i' || S.charAt(j) == 'o' || S.charAt(j) == 'u') {
		            count = 0;
		        } else {
		            count++;
		        }
		        if(count==4) {
		            break;
		        }
		    }
		    if(count==4) {
		        System.out.println("No");
		    } else {
		        System.out.println("Yes");
		    }
		}

	}
}
