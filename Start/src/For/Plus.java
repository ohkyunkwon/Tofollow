package For;

import java.util.Scanner;

public class Plus {
	public static void main(String[] arge) {
		/* ����
		 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է�
		 * ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
		 * ���
		 * 1���� n���� ���� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("��������� ���� ���ұ��? : ");
		int n = sc.nextInt();
		int y = 0;
		if(1<n && n<10000) {
			for(int i=0; i<=n; i++) {
				y= y+i;
			}
			System.out.println(y);
		}else {
			System.out.println("������ ������ϴ�.");
		}
	}
}
