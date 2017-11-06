package Strings;

import java.util.Scanner;

/**
 * Given two strings of lowercase English letters,  and , perform the following operations:
 * Sum the lengths of A  and B.
 * Determine if A is lexicographically larger than B (i.e.: does A come before B in the dictionary?).
 * Capitalize the first letter in A and B and print them on a single line, separated by a space.
 * @author violeta
 *
 */

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     String A=sc.next();
	     String B=sc.next();
	     
	     System.out.println(A.length() + B.length());
	     /* 0 - equals
	      * > 0 argument lexicographically greater than
	      * < 0 argument lexicographically less than
	      */
	     int result = A.compareTo(B); 
	     
	     if (result==0) System.out.println("Equals");
	     else if (result <0) System.out.println("No");
	     else if (result >0) System.out.println("Yes");
	     
	
	    String initialA = A.substring(0,1);
	    String formattedA = initialA.toUpperCase() + A.substring(1,A.length());
	    
	    String initialB = B.substring(0,1);
	    String formattedB = initialB.toUpperCase() + B.substring(1,B.length());
	    
	    System.out.println(formattedA + " " +formattedB);
   
	}

}
