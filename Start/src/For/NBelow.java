package For;

import java.util.Scanner;

public class NBelow {
	public static void main(String[] args) {
		/*
		 * ���� ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. �Է� ù°
		 * �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000) ��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ���
		 * 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�. ��� X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X����
		 * ���� ���� ��� �ϳ� �����Ѵ�.
		 * 
		 * Ǯ��
		 * 2. Ǯ��
		 * �Է� ���� ũ�� (n)�� �迭�� �Ҵ��Ͽ� �����մϴ�. (���� �Ҵ�)
		 * �� �� for ������ �迭�� �� ���� �Է� ���� ��,
		 * ���ο� for������ if���� ����Ͽ� x���� ���� ���ڸ� ����մϴ�.
		 * �������θ� �����ϱ� ������ �������� �ʴ� System.out.print �޼ҵ带 ����մϴ�.
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < a.length; ++i) {
			a[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < a.length; ++i) {
			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
