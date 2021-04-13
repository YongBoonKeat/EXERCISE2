package Exercise2point4;

public class Motorcycle {
	String brand;
	String color;
	int topSpeed;
	double weight;
	double fuelTankCapacity;
	int seat;
	int wheel;
	  
	 // Create Setter Method
	  public void setBrand(String brand) {
	    this.brand = brand;
	  }
	  
	  public void setColor(String color) {
		    this.color = color;
	  }
	  
	  public void setSpeed(int topSpeed) {
	    this.topSpeed = topSpeed;
	  }
	  
	  public void setWeight(double weight) {
		  this.weight = weight;
	  }
	  
	  public void setfuelTankCapacity(double fuelTankCapacity) {
		  this.fuelTankCapacity = fuelTankCapacity;
	  }
	  
	  public void setSeat(int seat) {
		  this.seat = seat;
	  }
	  public void setWheel(int wheel) {
		  this.wheel = wheel;
	  }
	  

	  // Create Getter Method
	  public String getBrand() {
		  return this.brand;
	  }
	  
	  public String getColor() {
	 	  return this.color;
 	  }
	  
	  public Integer getSpeed() {
		  return this.topSpeed;
	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	  public double getfuelTankCapacity() {
		  return this.fuelTankCapacity;
	  }
	  public int getSeat() {
		  return this.seat;
	  }
	  public int getWheel() {
		  return this.wheel;
	  }
}
