package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine(); // 입력받은 문자열
		
		int count = 0; // 걸리는 시간
		
		for(int i=0; i<s.length();i++) { //s의 길이 만큼 반복
			
			switch(s.charAt(i)) { //s 문자열 0부터 끝까지
				
			case'A' : case'B' : case'C':
				count += 3;
				break;
				
			case'D' : case'E' : case'F':
				count += 4;
				break;
				
			case'G' : case'H' : case'I':
				count += 5;
				break;
				
			case 'J' : case 'K': case 'L' : 
				count += 6;
				break;
                
			case 'M' : case 'N': case 'O' :
				count += 7;
				break;
                
			case 'P' : case 'Q': case 'R' : case 'S' : 
				count += 8; 
				break;
                
			case 'T' : case 'U': case 'V' : 
				count += 9;
				break;
                
			case 'W' : case 'X': case 'Y' : case 'Z' : 
				count += 10;
				break;
			}
		}
		System.out.print(count);
	}
}
