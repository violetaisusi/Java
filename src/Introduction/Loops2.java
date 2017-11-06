package Introduction;

import java.util.Scanner;

// (a + 2pow0 * b),(a + 2pow0 * b +a + 2pow1 * b), ...., (a + 2pow0 * b +a + 2pow1 * b + .... + a + 2pown-1)

public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int result=0;
	            for (int j=0;j<n;j++){
	            	result = (int) (result + (Math.pow(2,j)*b));
	            	System.out.print(a + result + " ");
	            }
	            System.out.println("");
	        }
	        in.close();

	}

}
