package arrays;

public class TwoDimensionalArray {
	
	public static void main(String[]arg) {
		
	int[][] a = new int [3][2]; // declaration of two dimensional array
		
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][1]=50;
		a[2][2]=60;
		 
		for(int i[]:a) 
		{
			for (int j:i) {
				System.out.print(j+ " ");
			}
			System.out.println();
			
		}
			
		
		
		
	}
	
	

}
