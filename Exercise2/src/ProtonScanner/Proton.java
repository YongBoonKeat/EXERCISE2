package ProtonScanner;
import java.util.*;//import util package that including Scanner class

public class Proton {

	Scanner s = new Scanner(System.in);
	
	void maxSpeed() {
		System.out.println("Enter Maximum Speed:");
		int m = s.nextInt();
		System.out.println("The maximum speed is: " + m);
	}
	void carColor() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Brand and Color:");
		String b = s.nextLine();
		String c = s.nextLine();
		
		System.out.println("The car brand is: " + b );
		System.out.println("The car color is: " + c);
	}
	
}
