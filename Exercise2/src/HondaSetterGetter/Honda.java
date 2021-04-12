package HondaSetterGetter;

public class Honda {
	String brand;
	String color;
	int topSpeed;
	double weight;
	double fuelTankCapacity;
	  
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
}