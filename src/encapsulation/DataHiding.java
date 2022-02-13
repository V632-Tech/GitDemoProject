package encapsulation;

public class DataHiding {
	
	private int balance;
	 
	public int getBal() {
		
		balance=1000;
		return balance;
		
	}
	
	public void setBal(int a)
	{
	System.out.println("setter method");
	balance=balance-a;
	System.out.println("Upated value:"+balance);
	
		
		
	}

}
