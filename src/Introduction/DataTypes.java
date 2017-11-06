package Introduction;

import java.util.Scanner;

/**
 * byte	8 bit signed value, values from -128 to 127
 * short 16 bit signed value, values from -32.768 to 32.767
 * int	32 bit signed value, values from -2.147.483.648 to 2.147.483.647
 * long	64 bit signed value, values from -9.223.372.036.854.775.808 to 9.223.372.036.854.775.808
 * A byte is an 8-bit signed integer.
 * A short is a 16-bit signed integer.
 * An int is a 32-bit signed integer.
 * A long is a 64-bit signed integer.
 * @author violeta
 *
 */
public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	                long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
	                
	                if(x>=Math.pow(-2, 7) && x<=(Math.pow(2, 7)-1))System.out.println("* byte");
	                if(x>=Math.pow(-2, 15) && x<=(Math.pow(2, 15)-1))System.out.println("* short");
	                if(x>=Math.pow(-2, 31) && x<=(Math.pow(2, 31)-1))System.out.println("* int");
	                if(x>=Math.pow(-2, 63) && x<=(Math.pow(2, 63)-1))System.out.println("* long");
	                
	                //Complete the code
	            }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }

	        }

	}

}
