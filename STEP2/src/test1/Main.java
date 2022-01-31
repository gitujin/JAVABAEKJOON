package test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int[] val = new int[10];
		
		for(int i=0; i<val.length;i++) {
			val[i] = (sc.nextInt()%42);
		}
		
		for(int i = 0; i<val.length; i++) {
			int cnt = 0;
			for(int j = i+1; j<val.length; j++) {
				if(val[i] == val[j]) {
					cnt++;
				}

		}
			if(cnt == 0) { 
				count++;
			}
		}
		System.out.println(count);
	}
}
