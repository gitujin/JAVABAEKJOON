package string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //N�Է¹���
		String a = sc.next(); //���ڸ� String���� �Է¹���
		
		int sum = 0;
		
		for(int i=0; i<N;i++) {
			 sum += a.charAt(i)-'0'; //charAt()�� �ƽ�Ű�ڵ� ���� ��ȯ�ϱ� ������ -'0' ����
		} //�Է¹��� ���ڿ��� ù��° ���Һ��� ������ ���ұ����� �� ����.
		
		System.out.println(sum);
	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                             