package PhoneProfile;

public class Phone {
	//declare all type of variable and variable name
	String brand;
	String color;
	int price;
	int quantity;
	double weight;
	char fingerprint;
	
	void printSpec(String b, String c, int p, int q, double w,char f) {
		System.out.println("Brand: " + b);
		System.out.println("Color: " + c);
		System.out.println("Price: RM" + p);
		System.out.println("Weight: " + w + "gram");
		System.out.println("Fingerprint: " + f);
		
	}
	void calPrice(int p, int q) {
		int TP = p*q; 
		System.out.println("Total price RM" + TP);
	}
}

