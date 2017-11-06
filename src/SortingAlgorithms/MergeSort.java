package SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
/**
 * Divide&Conquer algorithm
 * Divide and array to order in 2 pars
 * Order each part
 * Combine parts
 * Complexity= n/2 for divide and n for combine = n*log2n
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimension: array length");
		int n = sc.nextInt();
		int arrayInt[] = new int[n];
		System.out.println("Each element");
		for(int i=0;i<n;i++){
			arrayInt[i]=sc.nextInt();//ordered array
		}
		
		
		mergeSort(arrayInt,0,arrayInt.length-1);


	}

	 public static void mergeSort(int v[], int izq, int der) {
         int copia[] = Arrays.copyOf(v, v.length);
         mergeSort(v, copia, izq, der);
         printOrderedArray(v);
    }
	 private static void mergeSort(int v[], int copia[], int izq, int der) {
         if ( izq < der ){
             int mitad = (izq+der)/2;
             mergeSort(v, copia, izq, mitad);
             mergeSort(v, copia, mitad+1, der);
             fusion(v, copia, izq, mitad+1, der);
         }
     }
     
	 private static void fusion(int v[], int copia[], int izqA, int izqB, int derB){
		 for (int i = izqA; i <= derB; i++) {
	            copia[i] = v[i];
	        }
     int i = izqA, derA = izqB - 1, j = izqB, k = izqA;
     while ( i <= derA && j <= derB ) {
         if (copia[i] <= copia[j]) v[k] = copia[i++];
         else v[k] = copia[j++];
         k++;
     }
     for(int r = i; r <= derA; r++) v[k++] = copia[r];
     for(int r = j; r <= derB; r++) v[k++] = copia[r];
 }


private static void printOrderedArray(int[] arrayAsc){
	for (int i=0;i<arrayAsc.length;i++){
		System.out.println(arrayAsc[i]);
	}
}

}
