package If;

import java.util.Scanner;

public class Compare {
	public static void main(String[] arge) {
/*
 * ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.
 * A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
 * A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
 * A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int b = sc.nextInt();
		System.out.println("a �� ����  : "+ a);
		System.out.println("b �� ����  : "+ b);
		if(a > b){
			System.out.println(a + " > " + b);
		}else if(a < b) {
			System.out.println(a + " < " + b);
		}else if(a == b){
			System.out.println(a + " == " + b);
		}else {
			System.out.println("���ڸ� �Է����ּ���...");
		}
		
	}

}
