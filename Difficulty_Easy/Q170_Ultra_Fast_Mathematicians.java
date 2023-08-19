package Difficulty_Easy;

import java.util.Scanner;

public class Q170_Ultra_Fast_Mathematicians {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for(int i =1;i<=T;i++) {
			int M = kc.nextInt();
			int N = kc.nextInt();
			Math(M,N);
		}
	}
	public static void Math(int M, int N) {
		int C=Count(M);
		int[] arr = new int[C];
		int rem1=0;
		int rem2=0;
		int sum=0;
		int mul =1;
		for(int j=1;M!=0;j++) {
			rem1=M%10;
			rem2=N%10;
			if(rem1!=rem2) {
				arr[C-1]=1;
				C--;
			}
			else {
				arr[C-1]=0;
				C--;
			}
			mul=mul*10;
			M=M/10;
			N=N/10;
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	public static int Count(int M) {
		int count =0;
		while(M!=0) {
			count++;
			int rem = M%10;
			M/=10;
		}
		return count;	
	}
}