package Introduction;

import java.util.Scanner;

public class EOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
	        try {
	            int cont = 1;
	            while (scan.hasNextLine()){
	                    
	                String line = scan.nextLine();
	                System.out.println(cont++ + " " + line);   
	            }//when there are no more lines or Ctrl+Z (win) or Ctrl+D (linux)  is EOF 

	        } finally {
	            scan.close();
	        }
	}

}
