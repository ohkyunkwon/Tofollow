package For;

import java.util.Scanner;

public class Integer {
	public static void main(String[] args) {
		/*
		 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *  ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. 
		 *  �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, 
		 *  �� �ٿ� A�� B�� �־�����. (0 < A, B < 10) �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�׽�Ʈ ���̽� ���� : ");
		int count = sc.nextInt();
		for (int i = 0; i <= count; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A + B);
		}

	}

	public static int parseInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
