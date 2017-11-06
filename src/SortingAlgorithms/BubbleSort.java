package SortingAlgorithms;

import java.util.Scanner;

/**
 * sorting pairs of elements in an array
 * as many times as elements out of place
 * Complexity n * (number of unordered elements in the initial list - 1) 
 * -1 because elements are swapped in pairs so we can order 4 elements with 3 swaps
 * @author violeta
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arrayInt[] = new int[n];
		
		
		for(int i=0;i<n;i++){
			arrayInt[i]=sc.nextInt();
		}
		
		boolean flag;
		
		do{
			flag=false;
			
			for (int i=0;i<arrayInt.length-1;i++){
				if(arrayInt[i]>arrayInt[i+1]){
					int spare = arrayInt[i];
					arrayInt[i]=arrayInt[i+1];
					arrayInt[i+1]=spare;
					flag=true;
				}
			}
			System.out.println(" time ");
		}while(flag);
		printOrderedArray(arrayInt);
		
	}
	
	static void printOrderedArray(int[] arrayAsc){
		for (int i=0;i<arrayAsc.length;i++){
			System.out.println(arrayAsc[i]);
		}
	}

}
