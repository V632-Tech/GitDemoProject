package pack234;

public interface Inter2 {
	
	int t= 78 ; // public static final
	 static void get() //public
	 {
		 System.out.println("static method");
	 }
	 // JDK 1.8 +
	 default void set() { // public 
		 
		 System.out.println("default");
	 }
	 
	 void test(); //public abstract
	 void demo (); //public abstract
	  
	 
	 
	 
	 }
