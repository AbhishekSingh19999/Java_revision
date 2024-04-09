package array;
import java.util.Scanner;
public class threeD {

	public static void main(String[] args) {
		
		int a[][][]=new int[3][3][2];
		Scanner sc=new Scanner(System.in);
		for (int t=0;t<a.length;t++)
		{
			System.out.println("Table no:"+(t+1));
		
		   for (int r=0;r<a[t].length;r++)
		   {
			   System.out.println("Row no:"+(r+1));
			   
			   for (int c=0;c<a[t][r].length;c++)
			   {
				   System.out.println("Enter the elements:");
				   a[t][r][c]=sc.nextInt();
		   
	            }
		   }
		}
//			     To display the array
			    
			   for (int t=0;t<a.length;t++)
				{
					System.out.println("Table no:"+(t+1));
				
				   for (int r=0;r<a[t].length;r++)
				   {
//					   System.out.println("Row no:"+(r+1));
					   
					   for (int c=0;c<a[t][r].length;c++)
					   {
						   System.out.print(a[t][r][c]+"\t");
						 
					   }
					     System.out.println();
				   }
				}
	}
}

	
