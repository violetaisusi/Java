package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * split a string with a ßregular expression
 * matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens
 * s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
 * @author violeta
 *
 */
		
public class Tokens {

	public static void main(String[] args) {

		    Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        scan.close();

	        String[] tokens = s.split("[ !,?._'@]+"); // only the delimiters in the regular expression
	        System.out.println(tokens.length);
	        
	        for(int i=0;i<tokens.length;i++){
	        	System.out.println(tokens[i]);
	        }
	        

	}

}
