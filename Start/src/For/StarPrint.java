package For;

import java.util.Scanner;

public class StarPrint {
	public static void main(String[] args) {
		/*
		 * ���� ù° �ٿ��� �� 1��, ��° �ٿ��� ��2��, n��° �ٿ��� �� n���� ��� ���� ���� 1<= N <=100 ù° �ٺ��� N��° �ٱ���
		 * ���ʴ�� �� ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("����ϰ� ���� �� ���� �Է��ϼ���.: ");
		int N = sc.nextInt();

		if (1 <= N && N <= 100) {
			for (int i=0; i<N; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=0; i<N;i++) {
				for(int j=i; j<N-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else {
			System.out.println("������ ������ϴ�.");
		}
	}

}
