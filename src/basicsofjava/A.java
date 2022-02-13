package basicsofjava;

public class A 
{
	static int a=200;
	 float g=75.25f; // Non Static Global Variable
	
     public static void main(String[] args) 
     {
    	 A d= new A();
    	 d.test();
    	 mock();
		
	 }
     public void test() 
     {
    	 System.out.println(g);
    	 System.out.println(this.g);
    	 System.out.println(a);
    	 
     }
     
     public static void mock() 
     {
    	
    	 System.out.println("-----");
    	 System.out.println(a);
    	    	 
     }
}
