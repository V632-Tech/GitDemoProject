package basicsofjava;

public class Staticandnonstaticmethod {
	public static void m1() {
		System.out.println("m1 is runing");
	}
	public static void m2() {
		System.out.println("m2 is runing");
	}
	public void m3() {
		System.out.println("m3 is runing");
		}
	public void m4() {
		System.out.println("m4 is runing"); 
		}
	public int m5 (boolean b ,int c, double d)
	{
		System.out.println("value of b is :"+b);
		System.out.println("value of c is :"+c);
		System.out.println("value of d is :"+d);
		return c;
		
	}
	
	
	public static void main(String[] args) {
		m1();
		m2();
		Staticandnonstaticmethod x= new Staticandnonstaticmethod ();
				x.m3(); //calling of non static method in static method
				x.m4();
				System.out.println(x.m5(false, 12, 10.5)); // Calling method with return type and with argument
		
		
		
	}

	
}
