package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TypesofException {

	public static void main(String[] args) {
		
		// run time Exception
		
		// NullPointerException
		
		
		
		try {
			
			String s = null;
			
			System.out.println(s.length());
			
	}
		catch(NullPointerException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		String s1 = "abc";
		System.out.println(s1.length());
		 
		// ArrayIndexOutOfBoundsException
		
		int a []= new int[2];
		 
		a[0]=23;
		a[1]=45;
		try {
			a[4]=46;
			System.out.println(a[4]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		 
		// Arithmetic Exception
		int i=56;
		int j= 0;
		try
		{
			int g =i/j;
			System.out.println(g);
		}
		//
		
		catch(ArrayIndexOutOfBoundsException|ArithmeticException e)
		{
			System.out.println(e.getMessage());
	
	}
		// compile time Exception
		
		// FileNotFoundException
		try
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\chava\\Downloads\\MAY 21 BATCH GROUP 12 ALL RECORDED LECTURE.xlsx");
			System.out.println("file path is correct");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file path is not correct");
		}
		  
		// InterruptedException
		
		System.out.println("Before sleep");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("After Sleep");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
