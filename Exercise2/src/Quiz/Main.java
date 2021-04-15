package Quiz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MobilePhone Samsung = new MobilePhone();
		
		Samsung.setBrand();
		Samsung.setColor();
		Samsung.setWeight();
		Samsung.setRam();
		Samsung.setOp();
		
		System.out.println("Brand : " + Samsung.getBrand());
		System.out.println("Color: " + Samsung.getColor());
		System.out.println("Weight : " + Samsung.getWeight() + "g");
		System.out.println("Ram : " + Samsung.getRam() + "gb");
		System.out.println("Operating System : " + Samsung.getOp());
	}
}

