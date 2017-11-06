package Introduction;

/**
 * NumberFormat https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html 
 * use the NumberFormat class' getCurrencyInstance method
 * Expected Output
 * US: $12,324.13
 * India: Rs.12,324.13
 * China: ￥12,324.13
 * France: 12 324,13 €
 * @author violeta
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        //Language, country //
        Locale Locale_India = new Locale("en", "IN"); //"IANA Language Subtag Registry" = IN for India country
        NumberFormat india = NumberFormat.getCurrencyInstance(Locale_India);
        
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
	}

}
