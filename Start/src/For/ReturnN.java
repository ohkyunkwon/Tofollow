package For;

import java.util.Scanner;

public class ReturnN {
	public static void main(String[] args) {
		/*
		 * �ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է�
		 * ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
		 * ���
		 * ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		if(1<n || n>100000) {
			for(int i=1; i<=n; i++) {
				System.out.println(n);
				--i;
			}
		}
	}

}
