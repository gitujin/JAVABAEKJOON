package string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26]; // ºóµµ ¼ö ¼¿ ¹è¿­
		String s = sc.next();
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				arr[s.charAt(i)-'A']++;
			}
			else {
				arr[s.charAt(i)-'a']++;
			}
		}
		int max = -1;
		char ch = '?';
		
		for(int j = 0; j<26; j++) {
			if(max<arr[j]) {
				max = arr[j];
				ch = (char) (j + 65);
			}
			else if(max == arr[j]) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                             