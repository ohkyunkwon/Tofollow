package If;

import java.util.Scanner;

public class Gradecard {
	public static void main(String[] arge) {
		/*
		 * 시험 점수를 입력받아 
		 * 90 ~ 100점은 A, 
		 * 80 ~ 89점은 B, 
		 * 70 ~ 79점은 C, 
		 * 60 ~ 69점은 D, 
		 * 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요 : ");
		int score = sc.nextInt();
		if(score > 90) {
			System.out.println("A 학점 입니다.");
		}else if (score > 80) {
			System.out.println("B 학점 입니다.");
		}else if (score > 70) {
			System.out.println("C 학점 입니다.");
		}else if (score > 60){
			System.out.println("D 학점 입니다.");
		}else {
			System.out.println("F 학점 입니다.");
		}
		
	}

}
