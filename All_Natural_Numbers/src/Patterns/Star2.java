package Patterns;

public class Star2 {

	public static void main(String[] args) {
		
System.out.println("Star pattern for Triangle"); //left hypo... with spaces
		
		for(int i=1;i<=5;i++)
		{
			for(int s=4;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();	     
		}

	}



	}


