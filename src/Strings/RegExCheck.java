package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Valid syntax checking for a regular expression with Pattern 
 * https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29
 * @author violeta
 *
 */
public class RegExCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int testCases = Integer.parseInt(sc.nextLine());
	      
	      while(testCases>0){
	         String pattern = sc.nextLine();
	         Pattern p;
	         try{
	        	 p = Pattern.compile(pattern);
	        	 System.out.println("Valid");
	         }catch(PatternSyntaxException e){
	        	 //System.out.println(e.getMessage());
	        	 System.out.println("Invalid");
	         }
	      }
	      
	      sc.close();

	}

}
