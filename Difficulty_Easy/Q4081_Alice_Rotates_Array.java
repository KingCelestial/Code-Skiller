package Difficulty_Easy;

import java.util.Scanner;

public class Q4081_Alice_Rotates_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N =kc.nextInt();
		int K = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=kc.nextInt();
		}
		int[] ans =Rotate(arr,K);
		for(int j=0;j<ans.length;j++) {
			System.out.print(arr[j]+" ");
		}
	}
	public static int[] Rotate(int[] arr, int K) {
		int N=arr.length;
		Reverse(arr,0,N-K-1);
		Reverse(arr,N-K,N-1);
		Reverse(arr,0,N-1);
		return arr;
	}
	public static int[] Reverse (int[] arr, int i,int j){
		while(i<j) {
			int temp=arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
	}
}
