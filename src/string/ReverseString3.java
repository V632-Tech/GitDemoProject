package string;

public class ReverseString3 {
	 public static void mian (String[]args){
			String s = "Hello word";
			String rev= " ";
			String[] Splitvalue = s.split("\\s");
			int intsize = Splitvalue.length-1 ;
			int size = 0;
			for(int i =size; i>=0 ; i--)
			{
			System.out.print(Splitvalue[i]+" ");
			}
			}


}
