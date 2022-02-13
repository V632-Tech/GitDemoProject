package pack234;

public class C {
	public static void main(String[] args) {
		Inter2.get();
	//	d.get(); // static method cannot by implememtation class
		System.out.println(D.t);
		 //default method 
		// Inter2.set ();
		// D.set();
		D r =new D ();
		r.set();
		
	}

}
