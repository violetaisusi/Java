package Test;

import java.util.Scanner;
import java.util.Vector;
/**
 * Seach an element in an array
 * @author violeta
 *
 */
public class Trial {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
         int arrayInt[] = new int[n];
         
         for(int i=0;i<n;i++){      
	         arrayInt[i]=sc.nextInt();     
	      }

         int element = sc.nextInt();
         String sms = "No";
         
         for(int i=0;i<n;i++){
        	 if(arrayInt[i]==element){
        		sms="Yes";
        		 break;
        	 }
         }
         System.out.println(sms);
	}

}
