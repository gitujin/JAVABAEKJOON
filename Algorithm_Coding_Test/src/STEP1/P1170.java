package STEP1;

import java.util.Scanner;

public class P1170 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += cNum[i]-'0';
		}
		System.out.println(sum);
	}

}
