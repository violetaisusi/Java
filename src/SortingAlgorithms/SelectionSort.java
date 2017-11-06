package SortingAlgorithms;

import java.util.Scanner;

/**
 * Step 1 − Set MIN to location 0
 * Step 2 − Search the minimum element in the list
 * Step 3 − Swap with value at location MIN
 * Step 4 − Increment MIN to point to next element
 * Step 5 − Repeat until list is sorted
 * 2 loops: one nested in the other
 * (i)- from 0 to n-2 and (j)- from j=i=1 to n-1
 * Complexity = n * n = n^2
 * @author violeta
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arrayInt[] = new int[n];
		
		for(int i=0;i<n;i++){
			arrayInt[i]=sc.nextInt();
		}
		
		for (int i=0;i<arrayInt.length-1;i++){
			int lower = i;
			
			for (int j=i+1;j<arrayInt.length;j++){
				if (arrayInt[lower]>arrayInt[j]) 
					lower=j;
				//System.out.println("arrayInt[i]=" + arrayInt[i] + "arrayInt[j]=" + arrayInt[j] + "arrayInt[lower]=" + arrayInt[lower]);
			}
			
			if(arrayInt[i]>arrayInt[lower]) swapElements(i,lower,arrayInt);
		}
		
		printOrderedArray(arrayInt);
	}
	
	static void swapElements(int currentElement, int lowestElement,int[] arrayInt){
		
		int spare = arrayInt[currentElement];
		arrayInt[currentElement]=arrayInt[lowestElement];
		arrayInt[lowestElement]=spare;
		//System.out.println("arrayInt[currentElement]=" + arrayInt[currentElement] + "arrayInt[lowestElement]=" + arrayInt[lowestElement]);
	}
	
	static void printOrderedArray(int[] arrayAsc){
		for (int i=0;i<arrayAsc.length;i++){
			System.out.println(arrayAsc[i]);
		}
	}

}
