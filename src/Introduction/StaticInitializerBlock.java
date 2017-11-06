package Introduction;

import java.util.Scanner;

/**
 * Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
 * https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
 * @author violeta
 *
 */
public class StaticInitializerBlock {
	
	 /*Option 1
	  * static Scanner sc = new Scanner(System.in);
	 static int h = sc.nextInt();
	 static int b = sc.nextInt();*/
	
	//Option 2
	static Scanner sc;
	static int h;
	static int b;
	
	static{
		sc = new Scanner(System.in);
		h = sc.nextInt();
		b = sc.nextInt();
		
	    boolean flag = (h<=0 ||b<=0);
		
		   if (flag)
			try {
				throw new java.lang.Exception("Breadth and height must be positive");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
		    	 System.out.println(h*b);
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	    
	}

}
