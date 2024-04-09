package Patterns;

public class Hollow_rectangle {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
	//		System.out.print("*");
	//	}
		
	//	System.out.println();
		
	     	for(int j=1;j<=11;j++)
	     	{
	     		if(i==1||i==10||j==1||j==11)
	     		{
			    System.out.print("* ");
			 
		        }
	     		else 
	     		{
	     			System.out.print("  ");
	     		}
	     	}
	     	System.out.println();  /// control space to call an function
	}
	     	
	}
}

