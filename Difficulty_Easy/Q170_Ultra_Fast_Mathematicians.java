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
			int rem1=0;
			int rem2=0;
			int sum=0;
			int mul =1;
			for(int j=1;M!=0;j++) {
				rem1=M%10;
				rem2=N%10;
				if(rem1!=rem2) {
					sum=sum+1*mul;
					System.out.print(sum);
				}
				else {
					//sum=sum+0*mul;
					System.out.print("0");
				}
				mul=mul*10;
				M=M/10;
				N=N/10;
			}
			//System.out.println(sum);
		}

	}
}