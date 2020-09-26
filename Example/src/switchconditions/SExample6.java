package switchconditions;

public class SExample6 {

	public static void main(String[] args) {
		char branch='c';
		int collegeyear=4;
		switch(collegeyear) {
		case 1:System.out.println("math,phy,chem");
		break;
		case 2:
			switch(branch) {
			case 'm':System.out.println("mmath,mphy,mchem");
			break;
			case 'c':System.out.println("cmath,cphy,cchem");
			break;
			case 'b':System.out.println("bmath,bphy,bchem");
			break;
			}
			break;
		case 3:
			switch(branch) {
			case 'c':System.out.println("cmath,cphy,cchem");
			break;
			case 'b':System.out.println("bmath,bphy,bchem");
			break;
			case 'm':System.out.println("mmath,mphy,mchem");
			break;
			}
		break;
		case 4:
			switch(branch) {
			case 'b':System.out.println("bmath,bphy,bchem");
			break;
			case 'm':System.out.println("mmath,mphy,mchem");
			break;
			case 'c':System.out.println("cmath,cphy,cchem");
			break;
			}
		}
		

	}

}
