package TechniquesConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*if (primality(Integer.parseInt(args[0]))){
			System.out.println(args[0] + " is prime");
		}else{
			System.out.println(args[0] + " is NOT prime");
		}*/
		
		ArrayList<Integer> primeNumbers = new ArrayList();
		primeNumbers = primalityArray(args);
		
		Iterator it = primeNumbers.iterator();
		
		System.out.println("The prime numbers in the list are as follows:");
		
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}

	}
	
	  static ArrayList<Integer> primalityArray(String[] args){
	    	
	    	int num;
	    	boolean prime;
	    	ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
	    	
	    	for (int j=0;j<args.length;j++){
	    		
	    		prime=true;
	    		num=Integer.parseInt(args[j]);
			
				for (int i=2;i<num;i++){
					
					if (num % i== 0){ 
						prime=false;
						break;
					}
				}
				
				if (prime) primeNumbers.add(num);
				
	    	}
	    	
	    	return primeNumbers;
				
		}
	
    static void primality(String[] args){
    	
    	int num;
    	boolean prime;
    	
    	for (int j=0;j<args.length;j++){
    		
    		prime=true;
    		num=Integer.parseInt(args[j]);
		
			for (int i=2;i<num;i++){
				
				if (num % i== 0){ 
					prime=false;
					break;
				}
			}
			
			if (prime) System.out.println(num + " is prime");
			else System.out.println(num + " is NOT prime");
			
    	}
			
	}
	
	static Boolean primality(int num){
		
		if (num==1) return false;
		if (num==2) return true;		
		
		for (int i=2;i<num;i++){
			
			if (num % i== 0) return false;
		}
		
		return true;
	}

}
