package Quiz;

import java.util.Scanner;

public class MobilePhone {
	Scanner in = new Scanner(System.in);
	String brand;
	String color;
	double weight;
	int ram;
	String op;
	double size;
	int memory;
	String call;
 
	
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
			  System.out.print("Enter operating System: ");
			  this.op = in.next();
		  }
		  public void setSize() {
			  System.out.print("Enter size: ");
			  this.size = in.nextDouble();
		  }
		  public void setMemory() {
			  System.out.print("Enter memory(gb): ");
			  this.memory = in.nextInt();
		  }
		  public void setCall() {
			  System.out.print("Enter number to call: ");
			  this.call = in.next();
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
		  public double getSize() {
			  return this.size;
		  }
		  public int getMemory() {
			  return this.memory;
		  }
		  public String getCall() {
			  return this.call;
		  }
}
