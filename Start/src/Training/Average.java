package Training;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		/* 5�� ���� �Է�
		 * ������ 5�� ���
		 * 40�� ���� �� ��� (Ex)10�� 25��, 35��) ==> ������� ���� �ϰ� 40������ ����
		 * ��� ����
		 * 
		 */
		
		int result = 0;
		Scanner sc = new Scanner(System.in);
		 int[] a = new int[5];
		 for(int i=0; i<5; i++) {
			 a[i] = sc.nextInt();
			 
			 if(a[i]<40) {
				 a[i]=40;
			 result = result+a[i];
			 }
		 }
		 int b = result/5;
		 System.out.println(b);
	}

}
