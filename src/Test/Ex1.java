package Test;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		String string, sub;
	      int i, c, length;
	 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter a string to print it's all substrings");
	      string  = in.nextLine();
	 
	      length = string.length();   
	      
	      String arrayS[] = new String[(length*2)] ;
	    		  
	      System.out.println("Substrings of \""+string+"\" are :-");
	      int l=0;
	      for( c = 0 ; c < length ; c++ )
	      {
	         for( i = 1 ; i <= length - c ; i++ )
	         {
	            sub = string.substring(c, c+i);
	            arrayS[l++]=sub;
	            System.out.println(sub);
	         }
	      }
	      
	      String alphTop="";
	      
	      for(int k=0;k<(arrayS.length-2);k++)
	      {
	    	  System.out.println(arrayS[k]);
	    	  if(arrayS[k].compareTo(arrayS[(k+1)]) > 0)
	    		  alphTop = arrayS[k];
	    	  else
	    		  alphTop = arrayS[(k+1)];
	      }
	      System.out.println("alphTop="+alphTop);
	   }

	}


