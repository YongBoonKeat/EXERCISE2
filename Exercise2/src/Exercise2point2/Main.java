package Exercise2point2;

public class Main {

	public static void main(String[] args) {
		Computer Lenovo = new Computer();
		Computer HP = new Computer();
		Computer Asus = new Computer();
		Computer Acer = new Computer();

		System.out.println("LENOVO COMPUTER SPECIFICATION");
		Lenovo.printSpec("Lenovo","Legion 5i 15","Black","Intel i7",4200,16);
		Lenovo.CalPrice(4200,1,2);
		Lenovo.CalBalance(4500);
		Lenovo.screen(13.60, 7.60);
		System.out.println("===================================================");
		
		System.out.println("HP COMPUTER SPECIFICATION");
		HP.printSpec("HP","15s-du2131TU5","Silver","Intel i3",2100,8);
		HP.CalPrice(2100,2,3);
		HP.CalBalance(5000);		
		HP.screen(13.60, 7.60);
		System.out.println("===================================================");
		
		System.out.println("ASUS COMPUTER SPECIFICATION");
		Asus.printSpec("Asus","ROG Strix G15","Glacier Blue","Intel i5",3800,16);
		Asus.CalPrice(3800,1,2);
		Asus.CalBalance(4000);		
		Asus.screen(13.60, 7.60);
		System.out.println("===================================================");
		
		System.out.println("ACER COMPUTER SPECIFICATION");
		Acer.printSpec("Acer","Swift 5","Gray","Intel i5",3300,8);
		Acer.CalPrice(3300,2,2);
		Acer.CalBalance(8000);		
		HP.screen(12.1, 6.90);
		System.out.println("===================================================");
	}

}
