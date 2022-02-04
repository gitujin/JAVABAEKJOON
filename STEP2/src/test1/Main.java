package test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int[] arr;
		
		for(int i = 0; i <a; i++) {
			int N = sc.nextInt();
			arr = new int[N];
			double average; //평균
			double b = 0; //평균을 넘은 학생들의 수
			double sum = 0; //성적 합
			
			for(int j=0; j<N; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			average = sum/N;
			for(int k = 0; k<N; k++) {
				if(average<arr[k]) {
					b++;
				}
			}
			double result = b/N;
			System.out.println(String.format("%.3f",result*100)+"%");
		}
		sc.close();
	}
}
