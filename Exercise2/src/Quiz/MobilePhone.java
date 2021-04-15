package Quiz;

import java.util.Scanner;

public class MobilePhone {
	Scanner in = new Scanner(System.in);
	String brand;
	String color;
	double weight;
	int ram;
	String op;
	
	 public void setBrand () {
		 	System.out.print("Enter brand: ");
		 	this.brand = in.nextLine();
		  }
		  
		  public void setColor() {
			  System.out.print("Enter color: ");
			  this.color = in.nextLine();
		  }
		  
		  public void setWeight() {
			  System.out.print("Enter weight: ");
			  this.weight = in.nextDouble();
		  }
		  
		  public void setRam() {
			  System.out.print("Enter ram: ");
			  this.ram = in.nextInt();
		  }
		  public void setOp() {
			  System.out.print("Enter Operating System: ");
			  this.op = in.nextLine();
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
		  public String getOp() {
			  return this.op;
		  }
}
