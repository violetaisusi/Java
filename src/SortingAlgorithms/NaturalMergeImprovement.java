package SortingAlgorithms;
/**
 * Clearer coding implementation achieved handling many indexes in the while loop and fors to end the result array
 * Given 2 ordered arrays,
 * Merge them into a new one
 * arrayIntA and arrayIntB are the ordered arrays 
 * arrayIntR is the array where A and B will be merged and it will be filled and ordered at last.
 * Complexity arrayIntR.length
 */
import java.util.Scanner;

public class NaturalMergeImprovement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A dimension: array length");
		int nA = sc.nextInt();
		int arrayIntA[] = new int[nA];
		System.out.println("Each A element");
		for(int i=0;i<nA;i++){
			arrayIntA[i]=sc.nextInt();//ordered array
		}
		
		System.out.println("B dimension: array length");
		int nB = sc.nextInt();
		int arrayIntB[] = new int[nB];
		System.out.println("Each B element");
		
		for(int i=0;i<nB;i++){
			arrayIntB[i]=sc.nextInt();//ordered array
		}
		
		int arrayIntR[] = new int[arrayIntA.length+arrayIntB.length];
		
		int pointerA, pointerB; pointerA=pointerB=0;
		
		int j, k; j=k=0;
		
		while ( (k < arrayIntA.length) && (j < arrayIntB.length)) {
			//System.out.println("pointerA="+pointerA+"arrayIntA.length="+arrayIntA.length+"pointerB="+pointerB+"arrayIntB.length="+arrayIntB.length);
			if (arrayIntA[pointerA] <= arrayIntB[pointerB]) { arrayIntR[k] = arrayIntA[pointerA]; pointerA++; }
			else { arrayIntR[k] = arrayIntB[pointerB]; pointerB++; }
			
			k++;
		}
		System.out.println("pointerA="+pointerA+"arrayIntA.length="+arrayIntA.length+"pointerB="+pointerB+"arrayIntB.length="+arrayIntB.length);
		for(int pointerF=pointerA;pointerF<arrayIntA.length;pointerF++) {arrayIntR[k]=arrayIntA[pointerF];k++;}
		for(int pointerF=pointerB;pointerF<arrayIntB.length;pointerF++) {arrayIntR[k]=arrayIntB[pointerF];k++;}
		
		printOrderedArray(arrayIntR);
		
	}
		
	static void printOrderedArray(int[] arrayAsc){
		for (int i=0;i<arrayAsc.length;i++){
			System.out.println(arrayAsc[i]);
		}
	}

}
