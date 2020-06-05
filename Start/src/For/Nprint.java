package For;

import java.util.Scanner;

public class Nprint {
	public static void main(String[] arge) {
		/* 2741번
		 * 자연수 N이 주어졌을 때, 1부터 N까지 한줄에 하나씩 출력하는 프로그램을 작성하시오. 
		 * 조건 1 < N <100,000 첫째줄부터 N번째줄 까지 자례대로 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 까지 출력할지 입력하시오. : ");
		int n = sc.nextInt();
		if (1 < n || n > 100000) {
			for (int i = 1; i <= n; i++) {
				System.out.println(i+"번");
			}
		}
	}

}
