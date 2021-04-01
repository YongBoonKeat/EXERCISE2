package Exercise2;

public class Main {
	
	public static void main(String[] args) {
		Computer Lenovo = new Computer();
		Lenovo.brand = "Lenovo";
		Lenovo.model = "Legion 5i 15";
		Lenovo.color = "Black";
		Lenovo.core = "Intel i7";
		System.out.println("Brand: "+ Lenovo.brand);
		System.out.println("Model: " + Lenovo.model);
		System.out.println("Color: " + Lenovo.color);
		System.out.println("Core: " + Lenovo.core);
		System.out.println("Method of computer: ");
		Lenovo.printExecute();
		Lenovo.printSearch();
		Lenovo.printOperating();
		Lenovo.printData();
		
		System.out.println("========================================");
		
		Computer Hp = new Computer();
		Hp.brand = "Hp";
		Hp.model = "15s-du2131TU5";
		Hp.color = "Silver";
		Hp.core = "Intel i3";
		System.out.println("Brand: " + Hp.brand);
		System.out.println("Model: " + Hp.model);
		System.out.println("Color: " + Hp.color);
		System.out.println("Core: " + Hp.core);
		System.out.println("Method of computer: ");
		Hp.printExecute();
		Hp.printSearch();
		Hp.printOperating();
		Hp.printData();
		
		System.out.println("========================================");
		
		Computer Asus = new Computer();
		Asus.brand = "Asus";
		Asus.model = "ROG Strix G15";
		Asus.color = "Glacier Blue";
		Asus.core = "Intel i5";
		System.out.println("Brand: "+Asus.brand);
		System.out.println("Model: " + Asus.model);
		System.out.println("Color: " + Asus.color);
		System.out.println("Core: " + Asus.core);
		System.out.println("Method of computer: ");
		Asus.printExecute();
		Asus.printSearch();
		Asus.printOperating();
		Asus.printData();
		
}
}
