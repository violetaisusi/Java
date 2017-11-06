package BigNumbers;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Use of Math.BigInteger for adding and multiplying
 * @author violeta
 *
 */

public class MathBigInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.nextLine());
		BigInteger b = new BigInteger(sc.nextLine());
		sc.close();
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		
		
	}

}
