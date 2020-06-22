package Arrangement;

import java.util.Arrays;
import java.util.Collections;

public class St {
	public static void main(String[] args) {
		
		//오름차순
		int[] P = {1,4,3,4,5,6,77,55};
		Arrays.sort(P);
		for(int i=0; i<P.length; i++) {
			System.out.println(P[i]);
		}
		
		// 내림차순
		Integer[] C = {55,48,27,100,451,66};
		Arrays.sort(C, Collections.reverseOrder());
		for(int i=0; i<C.length; i++) {
			System.out.println(C[i]);
		}
	}
}
