package Arrangement;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] num = new int[a];
		
		for(int i=0; i<a; i++) {
			num[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(num);
		System.out.println(num[a-1]);
		if(num[a-1] == a) {
			System.out.println(num[a]);
		}
		}

}
