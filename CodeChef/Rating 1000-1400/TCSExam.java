// TCS Examination
// Two friends, Dragon and Sloth, are writing a computer science examination series. There are three subjects in this series: DSA, TOC, and DM. Each subject carries 100 marks.

// You know the individual scores of both Dragon and Sloth in all 3 subjects. You have to determine who got a better rank.

// The rank is decided as follows:

// The person with a bigger total score gets a better rank
// If the total scores are tied, the person who scored higher in DSA gets a better rank
// If the total score and the DSA score are tied, the person who scored higher in TOC gets a better rank
// If everything is tied, they get the same rank.


import java.lang.*;
import java.util.*;

class TCSExam
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
		    int dsad = sc.nextInt();
		    int tocd = sc.nextInt();
		    int dmd = sc.nextInt();
		    int sumd = dsad + tocd + dmd;
		    int dsas = sc.nextInt();
		    int tocs = sc.nextInt();
		    int dms = sc.nextInt();
		    int sums = dsas + tocs + dms;
		    if(sums>sumd) {
		        System.out.println("Sloth");
		    } else if(sumd>sums) {
		        System.out.println("Dragon");
		    } else {
		        if(dsas>dsad) {
		            System.out.println("Sloth");
		        } else if(dsas<dsad) {
		            System.out.println("Dragon");
		        } else if(tocs>tocd) {
		            System.out.println("Sloth");
		        } else if(tocs<tocd) {
		            System.out.println("Dragon");
		        } else if(dms>dmd) {
		            System.out.println("sloth");
		        } else if(dms<dmd) {
		            System.out.println("Dragon");
		        } else {
		            System.out.println("Tie");
		        }
		    }
		}
	}
}