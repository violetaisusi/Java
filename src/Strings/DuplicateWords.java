package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Find and remove duplicate words in a sentence using regular expresion and pattern
 * @author violeta
 *
 */
public class DuplicateWords {
	
	/*
	 	\b start of word word boundary
		\w+ any word character more than 1 times
		\1 same word matched already in the first parenthesis
		\b end of word
		()* Repeating again
		^ At the beginning 
		$ At the end
		
		\s	A whitespace character: [ \t\n\x0B\f\r]
		\S	A non-whitespace character: [^\s]
		\w	A word character: [a-zA-Z_0-9]
		\W	A non-word character: [^\w]
	 */

	public static void main(String[] args) {
		               
	    Scanner in = new Scanner(System.in);
	    int numSentences = Integer.parseInt(in.nextLine());
	        
	    boolean moreReps;
	        
	        while (numSentences-- > 0) {
	        	
	          String input = in.nextLine();
	            
	          do{
	            //w+ the following word is the same
	    		String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)";
	    				 		 
	    		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	            
	            Matcher m = p.matcher(input);

	            // Check for subsequences of input that match the compiled pattern
	            moreReps=false;
	            
	            while (m.find()) {
	            	 //System.out.println("m.group()="+m.group()+"m.group(i)="+m.group(1));            	 
	                 input = input.replaceAll(m.group(),m.group(1));
		             //System.out.println(input);
		             moreReps=true;
	            }
	            
	            // Prints the modified sentence.
	            //System.out.println(input);
	        }while(moreReps);
	        System.out.println(input);  
	     }
	        
	        in.close();

	}

}
