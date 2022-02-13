package basicsofjava;

public class Types_Of_Variable 
{
	static int a=500; // Static-Global Variable
	int c=600;        // Non-Static Global Variable
	
	public static void main(String[] args) 
	{
		 
		Test();
		Types_Of_Variable t=new Types_Of_Variable();
		t.Vish();
		
		
	
	}
	
	public static void Test()  
	{
		int d=100;                       // Local Variable   
		System.out.println(d);
		System.out.println(a);          // Calling of global variable
        System.out.println(Types_Of_Variable.a);
       
        
        
       
        
		 
	}
	public void Vish() 
	{
		String s="Vishanu Chavan";     // Local Variable
		System.out.println(s);
		System.out.println(a);        // calling of global variable
		System.out.println(this.c);   // Non Static Variable From Same Class
		                              // we need to use this keyword
		System.out.println(c);
		
		
		
		
		
	}

}
