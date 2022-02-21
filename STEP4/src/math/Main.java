package math;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		
		int X5; //5키로 갯수
		int X3; //3키로 갯수
		int y; //나머지
		
		if((N%5)%3!=0 && N%3 == 0) {
			X3 = N/3;
			System.out.println(X3);
		}
		
		if((N%5)%3 == 0) {
			X5 = N/5;
			y = N%5;
			X3 = y/3;
			System.out.println(X5+X3);
		}
		
	}
}
