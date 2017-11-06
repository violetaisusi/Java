package Strings;

import java.util.Scanner;

/**
 * Use of Regular expressions to check IP addresses 
 * IP format 000.000.000.000
 * IP address is a string in the form "A.B.C.D", where the value of 
 * A, B, C, and D may range from 0 to 255. 
 * Leading zeros are allowed. 
 * The length of A, B, C, or D can't be greater than 3.
 * @author violeta
 *
 */
public class IPRegEx {
	//static needed for this innerclass
	static class MyRegex{
		public String pattern;
		
		MyRegex(){//IP format 000.000.000.000
			
			pattern = "(2[0-5][0-5]|1[0-9][0-9]|0[0-9][0-9])"+"\\."
					+ "(2[0-5][0-5]|1[0-9][0-9]|0[0-9][0-9])"+"\\."
					+ "(2[0-5][0-5]|1[0-9][0-9]|0[0-9][0-9])"+"\\."
					+ "(2[0-5][0-5]|1[0-9][0-9]|0[0-9][0-9])";
		}		
	}

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     while(in.hasNext()){
	         String IP = in.next();
	         System.out.println(IP.matches(new MyRegex().pattern));
	     }

	}
	
	
}


