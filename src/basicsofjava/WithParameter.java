package basicsofjava;

public class WithParameter 
{
	int num3;
	int num4;
	String str1;
	String str2;
	
	// user defined constructor
	
	WithParameter(int a, int b)
	{
		num3=a;
		num4=b;
		
	}
	WithParameter(String s, String p)
	{
		str1=s;
		str2=p;
		
		
	}
	
	
	public static void main(String[] args) 
	{
		WithParameter g= new WithParameter(120,20);
		g.div();
		g.sub();
		
		WithParameter f= new WithParameter("Rajendra","Vishanu");
		f.r();
 
		
	}
	
	public void div() 
	{
		int c= num3/num4;
		System.out.println(c);
		
		
	}
	public void sub() 
	{
		int d=num3-num4;
		System.out.println(d);
		
	}
	public void r() 
	{
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
