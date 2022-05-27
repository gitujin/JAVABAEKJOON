package test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		int[] array = new int[26];
		
		for(int i=0; i<array.length; i++) {
			array[i] = -1;
		}
		
		String s = sc.nextLine();
		
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(array[ch-'a'] == -1) {
				array[ch - 'a'] = i;
			}
		}
		
		for(int val : array) {
			System.out.print(val+ " ");
		}
	}
}