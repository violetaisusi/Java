package TechniquesConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeNumbersHackerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	primality(args);

	}
	
	
    static void primality(String[] args){
    	
    	int num;
    	boolean prime;
    	
    	for (int j=1;j<args.length;j++){
    		
    		prime=true;
    		num=Integer.parseInt(args[j]);
		
			for (int i=2;i<num;i++){
				
				if (num % i== 0){ 
					prime=false;
					break;
				}
			}
			
			if (prime) System.out.println("prime");
			else System.out.println("NOT prime");
			
    	}
			
	}
}
	
	
