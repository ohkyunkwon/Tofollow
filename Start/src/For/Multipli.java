package For;

import java.util.Scanner;

public class Multipli {
	public static void main(String[] arge) {
		/*
		 * N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
		 * 2 �Է�
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * 2 * 5 = 10
		 * 2 * 6 = 12
		 * 2 * 7 = 14
		 * 2 * 8 = 16
		 * 2 * 9 = 18
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9 ���̿� ����ϰ���� ���� �Է��Ͻÿ�. :");
		int N = sc.nextInt();
		for(int i=N; i < 10;) {
			System.out.println("--------"+i+"��--------");
			for(int j=1; j < 10; j++) {
				System.out.println(i +" * " +j+" = "+i*j);
			}
			break;
		}
	}

}
