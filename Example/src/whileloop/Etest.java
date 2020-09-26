package whileloop;

public class Etest {
	static String name = "siddu";

	public static void main(String[] args) {
		try {

			if (name.startsWith("s")) {
				System.out.println("call statck");
			}

			else if (name.startsWith("q")) {
				System.out.println("call queue");
			}

			else {
				throw new ArithmeticException();
			}

		}

		catch (Exception e) {

			System.out.println("Invalid input");

		}

	}
}
