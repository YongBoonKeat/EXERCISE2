package Exercise2point3;
import java.util.*;

public class Computer {
	Scanner in = new Scanner(System.in);
	double TotalPrice;
	double price;
	double discount;
	
	void Gspec() {
		System.out.print("Enter brand and model of computer:");
		String n = in.nextLine();
		System.out.println("Brand and model of computer: " + n);
		
		System.out.print("Enter color of computer:");
		String color = in.nextLine();
		System.out.println("Color of computer: " + color);
		
		System.out.print("Enter core of computer:");
		String core = in.nextLine();
		System.out.println("Core of computer: " + core);
		
		System.out.print("Enter ram of computer:");
		int ram = in.nextInt();
		System.out.println("Ram of computer: " + ram + "gb");
	}

	void CalPrice() {
		System.out.print("Enter price of computer:");
		int p = in.nextInt();
		System.out.print("Enter quantity of computer:");
		int q = in.nextInt();
		price = p*q;
		System.out.print("Enter discount:");
		int d=in.nextInt();
		discount = price*d/100;
		TotalPrice = price-discount;
		
		System.out.println("Price of computer: RM" + p);
		System.out.println("Quantity of computer: " + q);
		System.out.println("Discount: " + d + "%");
		System.out.println("Total price after discount of computer: RM" + TotalPrice);
	}
	
	void CalBalance() {
		System.out.print("Enter amount of payment:");
		double py = in.nextDouble();
		double balance = py-TotalPrice;
		System.out.println("Obtained balance: RM "+ balance);
	}
	
	void display() {
		System.out.print("Width of screen computer:");
		double width = in.nextDouble();
		System.out.print("Height of screen computer:");
		double height = in.nextDouble();
		double screenarea = width*height;
		System.out.println("Screen area of computer is "+ screenarea + "''");
		System.out.print("Does the computer have an Anti Glare Screen(Y/N):");
		char ags1=in.next().charAt(0);
		if(ags1 == 'Y') {
			System.out.println("Anti Glare Screen: Yes");
		}
		else if(ags1=='N') {
			System.out.println("Anti Glare Screen: No");
		}
		else {
			System.out.println("-");
		}

	}
	void instruction() {
		System.out.println("Enter an instruction(Start,Shutdown,Sleep,Restart): ");
		String onoff = in.next();
		
		switch(onoff) {
		case "Start" : System.out.println("Turn On the PC");
						break;
		case "Shutdown" : System.out.println("Turn Off the PC");
						break;	
		case "Sleep" : System.out.println("Sleep the PC");
						break;	
		case "Restart" : System.out.println("Restart the PC");
						break;	
		}
		System.out.println();
		}
}
