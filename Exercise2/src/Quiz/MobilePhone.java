package Quiz;

import java.util.Scanner;

public class MobilePhone {
	Scanner in = new Scanner(System.in);
	String brand;
	String color;
	double weight;
	int ram;
	
	 public void setBrand () {
		 	System.out.println("Enter brand: ");
		 	this.brand = in.nextLine();
		  }
		  
		  public void setColor() {
			  System.out.println("Enter brand: ");
			  this.color = in.nextLine();
		  }
		  
		  public void setWeight() {
			  this.weight = in.nextDouble();
		  }
		  
		  public void setRam() {
			  this.ram = in.nextInt();
		  }
//Getter 
		  public String getBrand() {
			  return this.brand;
		  }
		  
		  public String getColor() {
		 	  return this.color;
	 	  }
		  
		  public double getWeight() {
			  return this.weight;
		  }
		  public int getRam() {
			  return this.ram;
		  }
}
