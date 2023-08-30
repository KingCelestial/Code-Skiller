package Difficulty_Medium;

import java.util.Arrays;
import java.util.Scanner;

public class Q497_Median_of_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=kc.nextInt();
		}
		int[] arr2 = new int[n];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=kc.nextInt();
		}
		Median(arr1,arr2,n);
	}
	public static void Median(int[] arr1, int[] arr2, int n) {
		int[] arr3=new int[n*2];
		int N1=arr3.length-1;
		int k=0;
		int j=0;
		for(int i=0;i<arr3.length;i++) {
			if(i%2==0) {
				arr3[i]=arr1[k];
				k++;
			}
			else {
				arr3[i]=arr2[j];
				j++;
			}
		}
		Arrays.sort(arr3);
			int M = (((N1/2)+((N1/2)+1))/2);
		System.out.println(arr3[M]);
		
	}

}
