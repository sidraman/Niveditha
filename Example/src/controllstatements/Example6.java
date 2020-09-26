package controllstatements;

public class Example6 {

	public static void main(String[] args) {
		int age=15;
		int weight=80;
		if(age>=18) {
			if(weight>=50) {
				System.out.println("eligebale to donate bload");
			}
			else {
				System.out.println("not eligeable");
			}
		}
		else {
			System.out.println("age must be greater than 18");
		}
	}

}
