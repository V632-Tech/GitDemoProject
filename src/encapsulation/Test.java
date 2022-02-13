package encapsulation;

public class Test {
	
	public static void main (String[]args) {
		
		DataHiding hd = new DataHiding();
		 int balance = hd.getBal();
		 System.out.println(balance);
		 hd.setBal(100);
	}
 
}
