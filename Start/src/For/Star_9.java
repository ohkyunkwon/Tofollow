package For;

import java.util.Scanner;

public class Star_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j =0; j < i; j++)
				System.out.print(" ");
			for (int j = 0; j < (n - i) * 2 - 1; j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n - i; j++)
				System.out.print(" ");
			for (int j = 0; j < (i + 1) * 2 - 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
