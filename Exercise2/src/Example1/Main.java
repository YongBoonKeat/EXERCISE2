package Example1;

public class Main {

	public static void main(String[] args) {
		
		Class1 c = new Class1();//create new object name as c
		System.out.println(c.x);
		System.out.println(c.s);
		c.printHi();
		c.printName();
		
		Class1 d = new Class1();//create second object name as d
		System.out.println(d.x);
		System.out.println(d.s);
		d.printHi();
		d.printName();
		
		Class2 e = new Class2();
		e.printSum();
		e.printSum1();
		e.printCgpa();
		
		Class3 f = new Class3();
		System.out.println(f.n);
		f.printFood();
	}

}
