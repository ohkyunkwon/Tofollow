package If;

import java.util.Scanner;

public class Gradecard {
	public static void main(String[] arge) {
		/*
		 * ���� ������ �Է¹޾� 
		 * 90 ~ 100���� A, 
		 * 80 ~ 89���� B, 
		 * 70 ~ 79���� C, 
		 * 60 ~ 69���� D, 
		 * ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ��� : ");
		int score = sc.nextInt();
		if(score > 90) {
			System.out.println("A ���� �Դϴ�.");
		}else if (score > 80) {
			System.out.println("B ���� �Դϴ�.");
		}else if (score > 70) {
			System.out.println("C ���� �Դϴ�.");
		}else if (score > 60){
			System.out.println("D ���� �Դϴ�.");
		}else {
			System.out.println("F ���� �Դϴ�.");
		}
		
	}

}
