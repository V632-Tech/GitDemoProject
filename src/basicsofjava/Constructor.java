package basicsofjava;

public class Constructor 
{
	int num1;
	int num2;
	// User Defined Constructor
	// without parameter
	
	Constructor()
	{
	num1=100;
	num2=200;
		
	}
	
	
	public static void main(String[] args) 
	{
		Constructor  d= new Constructor(); 
		d.Add();
		d.mul();
		
	}
	
	public void Add() 
	{
		
		int sum=num1+num2;
		System.out.println(sum);
	}
	
	public void mul() 
	{
		int mul= num1*num2;
		System.out.println(mul);
	}
	
	

}
