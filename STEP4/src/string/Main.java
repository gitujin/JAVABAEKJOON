package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s," "); // s = 문자열 , " " = 구분자
		
		System.out.println(st.countTokens());
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                             