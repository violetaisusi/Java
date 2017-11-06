package Strings;

import java.util.*;

/**
 * Lexical order
 * @author violeta
 *
 */

public class SubstringComparison {
	
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	      String s = scan.next();
	      int k = scan.nextInt();
	      scan.close();
	      
	      System.out.println(getSmallestAndLargest(s, k));
		
		
	}
	
	static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        List list = new ArrayList();
        int j=0;
        int end = (s.length()-k)+1;//+1 because index starts by 0
        
        for(int i=0;i<end;i++){
        	//System.out.println("lenght "+ s.length() + " j= " + j + " end " + end );
        	j = i + k;
        	list.add(s.substring(i, j));
        	
        }
        
    	System.out.println(list);
        
		Collections.sort(list);//sorting the list by natural order. It works because the objects are comparable 
		
		smallest = list.get(0).toString();
		largest = list.get(list.size()-1).toString();
		
		System.out.println(list);
        
        return smallest + "\n" + largest;
    }


}
