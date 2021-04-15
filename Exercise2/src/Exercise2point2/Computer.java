package Exercise2point2;

public class Computer {
	String brand;
	String model;
	String color;
	String core;
	int ram;
	double price;
	double discount;
	double totalprice;
	
	//Print specification
	void printSpec(String b, String m, String c, String core,int p,int r) {
		System.out.println("Brand: " + b);
		System.out.println("Model: " + m);
		System.out.println("Color: " + c);
		System.out.println("Core: " + core);
		System.out.println("Price: RM" + p);
		System.out.println("Ram: " + r + "gb");
	}
	
	void CalPrice(double p, int quantity,int d) {
		price = p*quantity; 
		discount=(price*d/100);
		totalprice= price-discount;
		System.out.println("Price per unit: RM" + p);
		System.out.println("Total unit: " + quantity);
		System.out.println("Discount: " + d + "%");
		System.out.println("Total price after discount: RM" + totalprice);
	}
	void CalBalance(double py) {	
		double balance= py-totalprice;
		System.out.println("Payment: RM "+ py);
		System.out.println("Balance: RM "+ balance);
	}

	void screen(double width,double height) {
		double screenarea = width*height;
		System.out.println("Screen area of computer is "+ screenarea + "''");
	}
}
