package HondaSetterGetter;

public class Main {

	public static void main(String[] args) {
		Honda h = new Honda();
		
		h.setBrand("Honda Monkey");
		h.setColor("Yellow");
		h.setSpeed(65);
		h.setWeight(94);
		h.setfuelTankCapacity(4.0);
		
		System.out.println("Brand : " + h.getBrand());
		System.out.println("Color: " + h.getColor());
		System.out.println("Top Speed : " + h.getSpeed() + "mph");
		System.out.println("Weight : " + h.getWeight() + "kg");
		System.out.println("Fuel Tank Capacity: " + h.getfuelTankCapacity() + "litres");
			
	}
}
