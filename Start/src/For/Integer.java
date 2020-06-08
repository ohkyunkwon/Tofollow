package For;

import java.util.Scanner;

public class Integer {
	public static void main(String[] args) {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 *  첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
		 *  각 테스트 케이스는 한 줄로 이루어져 있으며, 
		 *  각 줄에 A와 B가 주어진다. (0 < A, B < 10) 각 테스트 케이스마다 A+B를 출력한다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("테스트 케이스 갯수 : ");
		int count = sc.nextInt();
		for (int i = 0; i <= count; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A + B);
		}

	}

	public static int parseInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
