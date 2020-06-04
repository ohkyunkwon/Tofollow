package If;

import java.util.Scanner;

public class Compare {
	public static void main(String[] arge) {
/*
 * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 * A가 B보다 큰 경우에는 '>'를 출력한다.
 * A가 B보다 작은 경우에는 '<'를 출력한다.
 * A와 B가 같은 경우에는 '=='를 출력한다.
 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("숫자를 입력하세요 : ");
		int b = sc.nextInt();
		System.out.println("a 의 값은  : "+ a);
		System.out.println("b 의 값은  : "+ b);
		if(a > b){
			System.out.println(a + " > " + b);
		}else if(a < b) {
			System.out.println(a + " < " + b);
		}else if(a == b){
			System.out.println(a + " == " + b);
		}else {
			System.out.println("숫자를 입력해주세요...");
		}
		
	}

}
