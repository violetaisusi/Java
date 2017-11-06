package Strings;

import java.util.Scanner;

/**
 * Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
 * @author violeta
 *
 */
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String a = sc.nextLine().toLowerCase();
		String b = sc.nextLine().toLowerCase();
		sc.close();
		  if(isAnagram(a,b))
		    	System.out.println("Anagram");
		    else
		    	System.out.println("No Anagram");
	}
	
	 static boolean isAnagram(String a, String b) {

	     if (a.length()!=b.length()) return false;

	     int freqA, freqB; freqA=freqB=0;
	     
	     for(int i=0;i<a.length()-1;i++){//word scope - a reference
	    	 freqA=freqB=0;
	    	 char c = a.charAt(i); //char seek - every char in a how freq is in a and in b
	    	 System.out.println("c= " + c  );
	    	 
	    	 //is c in b? if so evaluate how frequent. Otherwise is not an Anagram
	    	 if (b.indexOf(String.valueOf(c))==-1) return false;
	    	 
	    	 freqA = charFrequence(a,String.valueOf(c));  //System.out.println(freqA);
	    	
	    	 freqB = charFrequence(b,String.valueOf(c));  //System.out.println(freqB);
	    	
	    	 if (freqA!=freqB) return false;
	     }
	     
	     return true;
	     
	 }
	 
	 static int charFrequence(String s,String c){
		 int freq, index; freq=index=0;
		 index = s.indexOf(c);//very important to evaluate the first character out of the loop
		 freq = freq + 1; 
		 while(!(index==-1)){
    		 index = s.indexOf(c,index+1);
    		 freq = freq + 1; 
    	 }
		 return freq;
	 }

}
