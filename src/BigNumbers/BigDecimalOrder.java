package BigNumbers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BigDecimalOrder {
	
	public static void main(String[] args) {
		//Input
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    String s[] = new String[n];

	    BigDecimal b[] = new BigDecimal[n];

	    for(int i=0;i<n;i++){
	    	String sFormatted;
	        s[i]=sc.next();
		    //.12 is not a good format for a BigDecimal
	       // System.out.println(s[i].indexOf("."));
	        if(s[i].indexOf(".")==0){
	        	sFormatted = "0"+ s[i];
	        	System.out.println(sFormatted);
	        	b[i]= new BigDecimal(sFormatted);
	        }else{
	        	sFormatted=s[i];
	        	b[i]= new BigDecimal(sFormatted);
	        }
	        
	    }
	    
	    for(int i=0;i<b.length;i++){
	    	//b[i].compareTo(b+i)
	    }
	    
	    Arrays.sort(b); //
	    System.out.println("------------------------------------");
	    for(int i=0;i<n;i++){
	        //System.out.println(s[i]);
	    	System.out.println(b[i].toString());
	    }
	    
	    sc.close();
	}
  	
}
