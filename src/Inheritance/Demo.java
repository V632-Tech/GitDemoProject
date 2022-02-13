package Inheritance;

public class Demo 
{
	
	public static void main(String[] args) 
	{
		
		// normal call
		
		System.out.println(A.a);
		A.test();
		A x= new A();
		System.out.println(x.b);
		x.method();
		
		//inheritance
		
		B.test();
		System.out.println(B.a);
		
		B r= new B();
		r.method();
		System.out.println(r.b);
		
		
		//normal call
		B.xyz();
		System.out.println(B.c);
		r.pqr();
		System.out.println(r.d);
		
	}

}
