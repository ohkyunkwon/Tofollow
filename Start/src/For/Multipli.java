package For;

import java.util.Scanner;

public class Multipli {
	public static void main(String[] arge) {
		/*
		 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		 * 2 입력
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
		System.out.print("1~9 사이에 출력하고싶은 단을 입력하시오. :");
		int N = sc.nextInt();
		for(int i=N; i < 10;) {
			System.out.println("--------"+i+"단--------");
			for(int j=1; j < 10; j++) {
				System.out.println(i +" * " +j+" = "+i*j);
			}
			break;
		}
	}

}
