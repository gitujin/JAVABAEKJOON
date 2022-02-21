package test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int money;
		int max= 0;
		
		if(A==B && B==C && C ==A) {
			money = (10000+(A*1000));
			System.out.println(money);
		}
		else if(A == B) {
			money = (1000 + (A*100));
			System.out.println(money);
		}
		else if(B == C) {
			money = (1000 + (B*100));
			System.out.println(money);
		}
		else if(A == C) {
			money = (1000 + (A*100));
			System.out.println(money);
		}
		
		else if(A!=B && B!=C && C!=B) {
			int[] a = new int[3];
			a[0] = A;
			a[1] = B;
			a[2] = C;
			for(int i=0;i<a.length;i++) {
				if(max < a[i]) {
					max = a[i];
				}
			}
			
			money= max*100;
			System.out.println(money);
		}
	}
}
