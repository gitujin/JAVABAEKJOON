package string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //N입력받음
		String a = sc.next(); //숫자를 String으로 입력받음
		
		int sum = 0;
		
		for(int i=0; i<N;i++) {
			 sum += a.charAt(i)-'0'; //charAt()은 아스키코드 값을 반환하기 때문에 -'0' 해줌
		} //입력받은 문자열의 첫번째 원소부터 마지막 원소까지의 합 구함.
		
		System.out.println(sum);
	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                             