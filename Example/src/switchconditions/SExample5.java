package switchconditions;

public class SExample5 {

	public static void main(String[] args) {
      String Stringlevel="Expert";
      int level=0;
      switch(Stringlevel) {
      case "Begginner":Stringlevel:level=1;
      break;
      case "Intermmidiate":Stringlevel:level=2;
      break;
      case "Expert":Stringlevel:level=3;
      break;
      default:level=0;
      }
System.out.println("your level is:"+level);
	}

}
