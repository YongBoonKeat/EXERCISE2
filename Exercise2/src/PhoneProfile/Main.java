package PhoneProfile;

public class Main {

	public static void main(String[] args) {
		Phone vivo = new Phone();//create new object from class Phone name as vivo
		Phone huawei = new Phone();//create second object from class Phone name as huawei
		Phone samsung = new Phone();//create third object from class Phone name as samsung
		Phone asus = new Phone();//create forth object from class Phone name as asus
		Phone lenovo = new Phone();//create fifth object from class Phone name as lenovo
		
		System.out.println("VIVO SPECIFICATION");
		vivo.printSpec("V19","Red",399,1,55.5,'N');
		vivo.calPrice(399,5);
		System.out.println();
		
		System.out.println("HUAWEI SPECIFICATION");
		huawei.printSpec("Nova2i","Black", 799,2, 45.5,'Y');
		huawei.calPrice(799,5);
		System.out.println();
		
		System.out.println("SAMSUNG SPECIFICATION");
		samsung.printSpec("Note8","Silver",3999,3,60.5,'Y');
		samsung.calPrice(3999,5);
		System.out.println();
		
		System.out.println("ASUS SPECIFICATION");
		asus.printSpec("Zenfone5","Gray",1299,4,50.5,'Y');
		asus.calPrice(1299,5);
		System.out.println();
		
		System.out.println("LENOVO SPECIFICATION");
		lenovo.printSpec("K12","Blue",1599,5,52.0,'Y');
		lenovo.calPrice(1599,5);
		System.out.println();

		
	}
	}

