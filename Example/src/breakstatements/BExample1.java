package breakstatements;

public class BExample1 {
	int x = 0;

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				int x = add(2, 3);
				System.out.println(x);
				break;

			}
			System.out.println(i);
		}

	}

	public static  int add(int x, int y) {
		int sum = x + y;
		return sum;
	}
}