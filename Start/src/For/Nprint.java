package For;

import java.util.Scanner;

public class Nprint {
	public static void main(String[] arge) {
		/* 2741��
		 * �ڿ��� N�� �־����� ��, 1���� N���� ���ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * ���� 1 < N <100,000 ù°�ٺ��� N��°�� ���� �ڷʴ�� ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ���� ������� �Է��Ͻÿ�. : ");
		int n = sc.nextInt();
		if (1 < n || n > 100000) {
			for (int i = 1; i <= n; i++) {
				System.out.println(i+"��");
			}
		}
	}

}
