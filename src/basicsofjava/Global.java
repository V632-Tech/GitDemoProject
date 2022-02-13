package basicsofjava;

public class Global 
{
	static int a=200; // Static Global Variable
	 
	String s="Chavan"; // Non Static
	
	public static void main(String[] args) 
	{
		
		test();
		Global d= new Global();
		d.mock();
		
	}
	// Static Method
	public static void test() 
	{
		
		System.out.println(Global.a);
		
		
	}
	
	// Non Static Method
	public void mock() 
	{
		System.out.println(a);
		System.out.println(s);
		System.out.println(this.s);
		
		
		
	}

}
