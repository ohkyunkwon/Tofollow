package For;

import java.util.Scanner;

public class StarSub {
	public static void main(String[] arge) {
		/*
		 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ���� ������, �������� �������� ������ ��(���� ����)��
		 * ����Ͻÿ�. �Է� ù° �ٿ� N(1 �� N �� 100)�� �־�����. ��� ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if (1 <= N && N <= 100) {
			for (int i = 0; i < N; i++) {
				for (int j = 1; j < N - i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < i + 1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
