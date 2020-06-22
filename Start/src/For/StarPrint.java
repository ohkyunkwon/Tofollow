package For;

import java.util.Scanner;

public class StarPrint {
	public static void main(String[] args) {
		/*
		 * 문제 첫째 줄에는 별 1개, 둘째 줄에는 별2개, n번째 줄에는 별 n개를 찍는 문제 범위 1<= N <=100 첫째 줄부터 N번째 줄까지
		 * 차례대로 별 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고 싶은 별 수를 입력하세요.: ");
		int N = sc.nextInt();

		if (1 <= N && N <= 100) {
			for (int i=0; i<N; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=0; i<N;i++) {
				for(int j=i; j<N-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else {
			System.out.println("범위를 벗어났습니다.");
		}
	}

}
