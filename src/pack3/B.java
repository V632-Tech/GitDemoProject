package pack3;

public class B extends A {

	
	public void test()
	{
		System.out.println("static test classB");
	}

public static void main(String[] args) {
	B r =new B();
	r.test();
	
	A y= new A();
	y.test();
	
}


}




