package While;

import java.util.Scanner;

public class Plus {
	public static void main(String[] args) {
		/*����
		 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է�
		 * �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * �Է��� ���������� 0 �� ���� ���´�.
		 * ���
		 * �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0&&b==0) break;
			System.err.println(a+b);
		}
	}

}
