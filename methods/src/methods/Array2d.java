package methods;

import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[2][2];
		
		for(int i=0;i<a.length;i++)
		{
			for(int c=0;c<a[i].length;c++)
			{
				System.out.println("elements are :" );
				a[i][c]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int c=0;c<a[i].length;c++)
			{
				System.out.print(a[i][c]+"\t" );
				
			}
			System.out.println( );
	}

	}
}
