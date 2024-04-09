package Patterns;

public class Star_updown {

	public static void main(String[] args) {
	for(int i=1; i<=5;i++)       // less than sign is used bcoz starts from 1
	{
		for(int j=5;j>=i;j--)   // value starts big then greater than will use
		{
			 System.out.print(" ");
		}
		 for(int k=1;k<=i;k++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	}
        
         
         for(int l=1; l<=6; l++)
         {
        	 System.out.print("*");
         }
         System.out.println();
         for(int m=1; m<=5; m++)
         {
        	 for(int n=1;n<=m;n++)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int p=5;p>=m;p--)
        	 {
        	 System.out.print("*");
         }
         System.out.println();
	}


}
}