package RecursiveFunction;

public class Foundation_1 {
	public static void main(String[] args) {
		System.out.println("1���� 5������ ���� : " + Function(5));
	}

	public static int Function(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num + Function(num - 1);
		}
	}

}
