package overridingconcept;

public class child extends parent {
	
	public void m1(){
		
		System.out.println("no argument method");
	}
	public void marry() {
		System.out.println("marry of child class");
		
	}
	public static void main (String[]args) {
		
		child c = new child();
		c.home();
		c.marry(); //child's marry method 
		c.m1();
		
		parent p = new parent();
		p.home();
		p.marry();
		p.m1(10);
		
		parent pp = new child ();
		pp.marry(); // child's marry method 
		pp.home();
		pp.m1(10);
	//	 child cc = new parent ();  // invalid in java
	}
	
	

	
	

}
