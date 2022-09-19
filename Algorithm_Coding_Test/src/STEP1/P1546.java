package STEP1;

import java.util.Scanner;

public class P1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 과목 갯수
		int a[] = new int[N]; // 성적 배열
		long M = 0;
		long sum = 0;
		for(int i=0; i<N; i++) {
		 a[i] = sc.nextInt();	
		}
		for(int i=0; i<N; i++) {
			if(M<a[i]) {
				M = a[i];
			}
			sum+=a[i];
		}
		System.out.println(sum*100.0/M/N);
	}

}
