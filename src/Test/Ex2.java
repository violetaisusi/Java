package Test;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	      System.out.println("Enter a string to print it's all substrings");
	      String s  = in.nextLine();
	 
		 int n = s.length();
	        String r = "";
	        int j=0;
	        for(int i=(s.length());i>0;i--){
	            String aux = s.substring(i-1,i);
	            
	            switch(aux){
	            	case "A":{ aux = "T"; break;}
	            	case "T":{ aux = "A"; break;}
	            	case "G":{ aux = "C"; break;}
	            	case "C":{ aux = "G"; break;}
	            	default: break;
	            }
	            
	            r = r + aux;
	            System.out.println(r);
	        }
	        
	
	}

}
