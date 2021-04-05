package Exercise2point2;

public class Main {

	public static void main(String[] args) {
		Computer Lenovo = new Computer();
		Computer HP = new Computer();
		Computer Asus = new Computer();
		Computer Acer = new Computer();

		System.out.println("LENOVO COMPUTER SPECIFICATION");
		Lenovo.printSpec("Lenovo","Legion 5i 15","Black","Intel i7",4200,16);
		Lenovo.calculateprice(4200,1);
		Lenovo.weight(2.5,1);
		Lenovo.OperatingSystem(2.6,5.1);
		System.out.println("=====================================");
		
		System.out.println("HP COMPUTER SPECIFICATION");
		HP.printSpec("HP","15s-du2131TU5","Silver","Intel i3",2500,8);
		HP.calculateprice(2100,2);
		HP.weight(2.0,2);
		HP.OperatingSystem(2.1,3.8);
		System.out.println("=====================================");
		
		System.out.println("ASUS COMPUTER SPECIFICATION");
		Asus.printSpec("Asus","ROG Strix G15","Glacier Blue","Intel i5",3999,16);
		Asus.calculateprice(3799,1);
		Asus.weight(2.2,1);
		Asus.OperatingSystem(2.5,4.5);
		System.out.println("=====================================");
		
		System.out.println("ACER COMPUTER SPECIFICATION");
		Acer.printSpec("Acer","Swift 5","Gray","Intel i5",3699,8);
		Acer.calculateprice(3399,2);
		Acer.weight(2.3,2);
		Acer.OperatingSystem(2.4,4.5);
		System.out.println("=====================================");
	}

}
