package Exercise2;

public class Main {

	public static void main(String[] args) {
		ClassComputer a = new ClassComputer();
		System.out.println("Brand: " + a.brand);
		System.out.println("Model: " + a.model);
		System.out.println("Color: " + a.color);
		System.out.println("Core: " + a.core);
		System.out.println("Method of computer: ");
		a.printA();
		a.printB();
		a.printC();
		a.printD();
		
		System.out.println();
		
		ClassComputer2 b = new ClassComputer2();
		System.out.println("Brand: " + b.brand);
		System.out.println("Model: " + b.model);
		System.out.println("Color: " + b.color);
		System.out.println("Core: " + b.core);
		System.out.println("Method of computer: ");
		b.printA();
		b.printB();
		b.printC();
		b.printD();
		
		System.out.println();
		
		ClassComputer3 c = new ClassComputer3();
		System.out.println("Brand: " + c.brand);
		System.out.println("Model: " + c.model);
		System.out.println("Color: " + c.color);
		System.out.println("Core: " + c.core);
		System.out.println("Method of computer: ");
		c.printA();
		c.printB();
		c.printC();
		c.printD();
		
		
}
}
