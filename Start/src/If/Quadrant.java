package If;

import java.util.Scanner;

public class Quadrant {
	public static void main(String[] arge) {
		/*
		 * ���� ���� ���� �� �ϳ��� �־��� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���̴�. ��и��� �Ʒ� �׸�ó�� 1���� 4���� ��ȣ�� ���´�. "Quadrant n"�� "��n��и�"�̶�� ���̴�.
		 * ���� ���, ��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�. 
		 * �� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.
		 * ���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
		 * ��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.
		 * 
		 * 2��и�	|   1��и�
		 * 			|
		 * 			|
		 * --------------------
		 * 			|
		 * 			|
		 * 3��и�	|   4��и�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���.: ");
		int x = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���.: ");
		int y = sc.nextInt();
		if(-1000 <= x && x <= 1000) {
			if(-1000 <= y && y <= 1000) {
				if(x > 0 && y > 0) {
					System.out.println("1��и� �Դϴ�.");
				}else if(x < 0 && y > 0) {
					System.out.println("2��и� �Դϴ�.");
				}else if (x < 0 && y < 0) {
					System.out.println("3��и� �Դϴ�.");
				}else {
					System.out.println("4��и� �Դϴ�.");
				}
			}
			
		}
		
	}

}
