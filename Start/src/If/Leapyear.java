package If;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] arge) {
		/*
		 * ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
		 * ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 
		 * 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. 
		 * ������, 2000���� 400�� ����̱� ������ �����̴�.
		 */
		System.out.print("�⵵�� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
			System.out.println(year + "���� �����Դϴ�. : 1");
		}else {
			System.out.println(year + "���� ������ �ƴմϴ�. : 0");
		}
	}

}
