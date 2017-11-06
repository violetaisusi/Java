package Strings;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        //String index starts by 0
        String piece = S.substring(start, end);
        
        System.out.println(piece);
	}

}
