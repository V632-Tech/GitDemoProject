package pack3;

public class ClassA {
	
	// Method overloading
	public static int test () {
	
		
	int a=20;
	
	System.out.println(a);
	return a;
	
	
	}
	
	
	static void test (char b, int a) {
		System.out.println(" static test with argument as char and int");
		
	}
	static void test (int a) {
		System.out.println("non static test");
		
	}
	
	
	private char test(char g) {
		System.out.println("char type");
		return 0;
	}
	
	public static void main(String[]args) {
		test();
		test(6);
		test('g',5);
		ClassA t = new ClassA();
		t.test('&');
		
	}

}
