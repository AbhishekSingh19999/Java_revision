package array;

import java.util.Scanner;

public class fourD {

	public static void main(String[] args) {
		int a[][][][]=new int[2][3][3][2];
		Scanner sc=new Scanner(System.in);
		for(int t1=0;t1<a.length;t1++)
		{
			System.out.println("outer most table :"+(t1+1));
		   
		for (int t=0;t<a[t1].length;t++)
		{
			System.out.println("Table no:"+(t+1));
		
		   for (int r=0;r<a[t1][t].length;r++)
		   {
			   System.out.println("Row no:"+(r+1));
			   
			   for (int c=0;c<a[t1][t][r].length;c++)
			   {
				   System.out.println("Enter the elements:");
				   a[t1][t][r][c]=sc.nextInt();
		   
	            }
		   }
		}
//			     To display the array
		}		    
		for(int t1=0;t1<a.length;t1++)
		{
			System.out.println(" Outermost Table no:"+(t1+1));
		   
		for (int t=0;t<a[t1].length;t++)
		{
			System.out.println("Table no:"+(t+1));
		
		   for (int r=0;r<a[t1][t].length;r++)
		   {
			  // System.out.println("Row no:"+(r+1));
			   
			   for (int c=0;c<a[t1][t][r].length;c++)
			   {
				   System.out.print(a[t1][t][r][c]+"\t");
				  
	           }
			        System.out.println();
            }
		}
	}	
}
}


