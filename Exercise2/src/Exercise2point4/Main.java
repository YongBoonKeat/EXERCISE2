package Exercise2point4;

public class Main {

	public static void main(String[] args) {
		Motorcycle Honda = new Motorcycle();
		
		Honda.setBrand("Honda Monkey");
		Honda.setColor("Yellow");
		Honda.setSpeed(65);
		Honda.setWeight(94);
		Honda.setfuelTankCapacity(4.0);
		Honda.setSeat(2);
		Honda.setWheel(2);
		
		System.out.println("Brand : " + Honda.getBrand());
		System.out.println("Color: " + Honda.getColor());
		System.out.println("Top Speed : " + Honda.getSpeed() + "mph");
		System.out.println("Weight : " + Honda.getWeight() + "kg");
		System.out.println("Fuel Tank Capacity: " + Honda.getfuelTankCapacity() + "litres");
		System.out.println("Limit seat: " + Honda.getSeat() + "people");
		System.out.println("Wheel: " + Honda.getWheel());
	}
}
