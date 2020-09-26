package switchconditions;

public class Sexample2 {

	public static void main(String[] args) {
		int month=1;
		String monthString="";
		switch(month) {
		case 1:/*monthString=*/System.out.println("1-january");
		break;
		case 2:/*monthString=*/System.out.println("2-february");
		break;
		case 3:/*monthString=*/System.out.println("3-march");
		break;
		default:System.out.println("invalid month");
		}
		/*System.out.println(monthString);*/
	}

}
