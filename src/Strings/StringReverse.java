package Strings;

import java.util.Scanner;

/**
 * Identifying palindromes: a word, phrase, number, or other sequence of characters which reads the same backward or forward
 * 
 */
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     String s=sc.next().toLowerCase();
	     sc.close();
	    if(isPalindrome(s))
	    	System.out.println("Yes");
	    else
	    	System.out.println("No");
	}
	
	static boolean isPalindrome(String s){
		
		int slength = s.length();
		
		for(int i=0;i<(slength/2)+1;i++){
	          char left = s.charAt(i);
	          char right = s.charAt(slength-i-1);
	          
	          //System.out.println(left + " - " + right);
	          
	          if(left!=right) return false;
	        	  
	     }
		return true;
	}

}
