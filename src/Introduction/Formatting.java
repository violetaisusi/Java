package Introduction;

import java.util.Scanner;

public class Formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next();
             int s1Lengh = s1.length();
             for(int j=s1.length();j<10;j++){
            	 s1 = s1 + " ";
             }
            System.out.print(s1);
             int x=sc.nextInt();
             String sx = x + "";
             int xLenght = sx.length();
             String FormatedNum =x + "";
             
             for(int z=xLenght;z<3;z++){
            	 FormatedNum = "0" + FormatedNum;
             }
             
             System.out.println(FormatedNum);
             //Complete this line
         }
         System.out.println("================================");


	}

}
