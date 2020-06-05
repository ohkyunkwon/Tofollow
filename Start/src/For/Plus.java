package For;

import java.util.Scanner;

public class Plus {
	public static void main(String[] arge) {
		/* 문제
		 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		 * 입력
		 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
		 * 출력
		 * 1부터 n까지 합을 출력한다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번까지의 합을 구할까요? : ");
		int n = sc.nextInt();
		int y = 0;
		if(1<n && n<10000) {
			for(int i=0; i<=n; i++) {
				y= y+i;
			}
			System.out.println(y);
		}else {
			System.out.println("범위를 벗어났습니다.");
		}
	}
}
