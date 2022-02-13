//factorial of is 5!=5*4*3*2*1= 120


package basicsofjava;

public class factorialnumber {
	public static void main (String[]args) {
		int num=5;
		long factorial =1;
		
		for (int i=num;i>=1;i--) 
		{
			factorial=factorial*i ; //5 20 60 120 120
			
		}
		System.out.println("factorial of a number is:" + factorial);
		
	}

}
