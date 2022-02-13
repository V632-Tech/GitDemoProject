package arrays;

public class ArrayExample3 {
	
	public static void main (String[]arg) {
		
		Object a[] = new Object [5];
		a[0]=10 ; 
		a[1]= 20.5;
		a[2]= "welcome";
		a[3]='m';
		a[4]= true;
		// for ...each loop
	for(Object i:a) 
	{
		
		System.out.println(i);
		
	}
		
		
	}

}
