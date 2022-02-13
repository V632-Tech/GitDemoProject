package Inheritance;

public class child extends parent{
	
	int y = 50;
	int i = 50;
	public void college () 
	{
		int y = 10;
		System.out.println("college is running");
		System.out.println(y); //local variable y
		System.out.println(this.y); //global non static variable y 
		System.out.println(i); // this i refers to one which is nearest i.e in this child class
		                       //     i variable 
		System.out.println(super.i); //this will refer to the variable which is available in 
		                               // in parent's class.
		
	}
	
	public static void main(String[] args) {
		
		child c = new child ();
		c.college();
		c.bike();
		c.home();
		c.car();
		System.out.println(c.i);
		
	}

}
