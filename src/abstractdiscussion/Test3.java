package abstractdiscussion;

public class Test3 extends Test2 {

	
	public void m4() 
	{
		System.out.println("m4 from Test 3");
		
	}
	
	public static void main(String[]args) {
		
		Test3 t3 = new Test3();
		t3.m1();
		t3.m2();
		t3.m3();
		t3.m4();
	}


}
