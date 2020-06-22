package Training;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		/* 5명에 점수 입력
		 * 점수는 5의 배수
		 * 40점 이하 일 경우 (Ex)10점 25점, 35점) ==> 보충수업 듣기로 하고 40점으로 변경
		 * 평균 구함
		 * 
		 */
		
		int result = 0;
		Scanner sc = new Scanner(System.in);
		 int[] a = new int[5];
		 for(int i=0; i<5; i++) {
			 a[i] = sc.nextInt();
			 
			 if(a[i]<40) {
				 a[i]=40;
			 result = result+a[i];
			 }
		 }
		 int b = result/5;
		 System.out.println(b);
	}

}
