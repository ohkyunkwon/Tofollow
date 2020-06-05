package For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FastPlus {
	public static void main(String[] arge) throws IOException {
		/*
		 * ���� ���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. ����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� ��
		 * �ִٴ� ���̴�. Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader��
		 * BufferedWriter�� ����� �� �ִ�. BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�
		 * BufferedWriter �ܿ���, StringBuilder�� ����� ��� ���Ҵٰ� �� String�� System.out.println�ϴ¹���� �ֽ��ϴ�. 
		 * �Է� ù �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. T�� �ִ� 1,000,000�̴�.
		 * ���� T�ٿ��� ���� �� ���� A�� B�� �־�����. 
		 * A�� B�� 1 �̻�, 1,000 �����̴�. ��� �� �׽�Ʈ���̽����� A+B�� �� �ٿ� �ϳ��� ������� ����Ѵ�.
		 * 
		 * 
		 * ���� �ܼ��ؼ� �ӵ� �������� �𸣰ڴ�.
		 */

//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//		if (1 < T && T < 1000000) {
//			for (int i = 0; i < T; i++) {
//				int A = sc.nextInt();
//				int B = sc.nextInt();
//				System.out.println(A + B);
//			}
//		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		
		for(int i=0; i < n; i++) {
			String text = br.readLine();
			String[] word = text.split(" ");
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			bw.write((a+b) + "\n");
		}
		bw.flush();
		bw.close();

	}

}
