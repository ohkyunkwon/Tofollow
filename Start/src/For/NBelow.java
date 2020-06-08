package For;

import java.util.Scanner;

public class NBelow {
	public static void main(String[] args) {
		/*
		 * 문제 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오. 입력 첫째
		 * 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000) 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두
		 * 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다. 출력 X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다
		 * 작은 수는 적어도 하나 존재한다.
		 * 
		 * 풀이
		 * 2. 풀이
		 * 입력 받은 크기 (n)로 배열을 할당하여 선언합니다. (동적 할당)
		 * 그 후 for 문으로 배열에 각 값을 입력 받은 후,
		 * 새로운 for문에서 if문을 사용하여 x보다 작은 숫자만 출력합니다.
		 * 공백으로만 구분하기 때문에 개행하지 않는 System.out.print 메소드를 사용합니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < a.length; ++i) {
			a[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < a.length; ++i) {
			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
