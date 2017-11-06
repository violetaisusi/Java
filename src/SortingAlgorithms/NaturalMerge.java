package SortingAlgorithms;
/**
 * Given 2 ordered arrays,
 * Merge them into a new one
 * arrayIntA and arrayIntB are the ordered arrays 
 * arrayIntR is the array where A and B will be merged and it will be filled and ordered at last.
 * Complexity arrayIntR.length
 */
import java.util.Scanner;

public class NaturalMerge {

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
		
		for(int i=0;i<arrayIntR.length;i++){
			if(arrayIntA[pointerA]<=arrayIntB[pointerB]){
				
				if(pointerA<arrayIntA.length-1){
					arrayIntR[i]=arrayIntA[pointerA];
					pointerA += 1;
				}else{
					arrayIntR[i]=arrayIntA[pointerA];//last one from A
					//finish with B
					for(int j=pointerB;j<arrayIntB.length;j++){
						i += 1;
						arrayIntR[i]=arrayIntB[j];
					}
				}
				
			}else if(arrayIntA[pointerA]>arrayIntB[pointerB]){
				
				if(pointerB<arrayIntB.length-1){
					arrayIntR[i]=arrayIntB[pointerB];
					pointerB += 1;
				}else{
					arrayIntR[i]=arrayIntB[pointerB];//last one from B
					//finish with A
					for(int j=pointerA;j<arrayIntA.length;j++){
						i += 1;
						arrayIntR[i]=arrayIntA[j];
					}
				}
			}
		}
		printOrderedArray(arrayIntR);
		
	}
		
	static void printOrderedArray(int[] arrayAsc){
		for (int i=0;i<arrayAsc.length;i++){
			System.out.println(arrayAsc[i]);
		}
	}

}
