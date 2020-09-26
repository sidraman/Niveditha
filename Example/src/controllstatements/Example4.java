package controllstatements;

public class Example4 {

	public static void main(String[] args) {
	int marcks=80;
	if(marcks<50) {
		System.out.println("FAIL");
	}
	else if(marcks>=50 && marcks<60) {
		System.out.println("D grade");
	}
	else if(marcks>=60 && marcks<70) {
		System.out.println("C grade");
	}
	else if(marcks>=70 && marcks<80) {
		System.out.println("B grade");
	}
	else if(marcks>=80 && marcks<90) {
		System.out.println("A grade");
	}
	else if(marcks>=90 && marcks<100) {
		System.out.println("A+ grade");
	}
	else {
		System.out.println("invalid");
	}
	}

}
