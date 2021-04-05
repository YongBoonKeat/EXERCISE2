package ExampleArray;

import Exercise2.Computer;

public class Main1 {

	public static void main(String[] args) {

		Computer1 Lenovo = new Computer1();
		System.out.println("Brand: " + Lenovo.brand[0]);
		System.out.println("Model: " + Lenovo.model[0]);
		System.out.println("Color: " + Lenovo.color[0]);
		System.out.println("Core: " + Lenovo.core[0]);
		System.out.println("Method of computer: ");
		
		
		System.out.println("========================================");
		
		Computer1 Hp = new Computer1();
		System.out.println("Brand: " + Hp.brand[1]);
		System.out.println("Model: " + Hp.model[1]);
		System.out.println("Color: " + Hp.color[1]);
		System.out.println("Core: " + Hp.core[1]);
		System.out.println("Method of computer: ");
		
		
		System.out.println("========================================");
		
		Computer1 Asus = new Computer1();
		System.out.println("Brand: "+Asus.brand[2]);
		System.out.println("Model: " + Asus.model[2]);
		System.out.println("Color: " + Asus.color[2]);
		System.out.println("Core: " + Asus.core[2]);
		System.out.println("Method of computer: ");
	

	}

}
