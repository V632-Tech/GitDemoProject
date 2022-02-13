package string;

public class StringMethod {
	public static void main (String[]args) {
		
		String s = " I like Automation ";
	String b = s.trim();
		System.out.println(b);
		
	String c = "Automation Testing";
		String a[]=c.split(" ");
		for(String x:a) 
		{
		System.out.println(x);
		}
	//	String x ="gff f46346VTF% fde^734 8647^%&^%^";
	//	System.out.println(x.replaceAll("[^a-zA-Z0-9]",""));
		
	//	String z ="Velocity";
	//	System.out.println( z.replace('V', 'x'));
		
	//	System.out.println(z.concat(" Institute"));
	//	boolean t = z.equals("velocity");
	//	System.out.println(t);
	//	boolean t = z.equalsIgnoreCase("velocity");
	//	System.out.println(t);
		
	//	System.out.println(z.toUpperCase());
	//	System.out.println(z.toLowerCase());
	//	System.out.println(z.length());
	//	System.out.println(z.charAt(3)); // index
		
	//	System.out.println(z.substring(1, 5)); // index 1-4
		
	//	String z ="Velocity";
	//	System.out.println(z.indexOf('i'));
	//	System.out.println(z.lastIndexOf('e'));
		
	//	String s20 = "abcdef";
	//	boolean isstart = s20.startsWith("ab");
		
	//	System.out.println(isstart);

	//	boolean isend = s20.endsWith("def");
	//	System.out.println(isend);
		
		
	//	String s19 = "abcdef";
	 //   boolean ispresent = s19.contains("abd");
	//    System.out.println(ispresent);
		
	//	String a ="Institute";
	//	String b = a.replace("tute","pune"); // retun type String

	//	System.out.println(b);
		
	//	String s = "velocity";
	//	char[]ca =s.toCharArray();
	//	for(char cz:ca) {
	//		System.out.println(cz);
	//	}
		
		String s28 = "a2kds232";
		boolean isnum = Character.isDigit('2'); // only interger
		System.out.println("Is num returns :"+isnum);
				
		
				 String s29 = "This is String";

				String[] splittedstring = s29.split(" ");

				for(String ttt:splittedstring)
				{
					System.out.println(ttt);
				}

				
		
		 
		
		
		
		
		
		
		
		
				
			
				
			
	}

}




