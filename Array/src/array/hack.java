package array;

import java.util.Scanner;

public class hack {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int N = scanner.nextInt() ;
		
		//N=N/2;
	      
         if(N%2!=0)
         {
              System.out.println("Weird");
         }
         else if(N>=2&&N<=5)
         {
              System.out.println("Not Weird");
         }
         else if(N>=6&&N<=20)
         {
              System.out.println("Weird");
         }
          else if(N>=20)
          {
               System.out.println("Not Weird");
          }
         else 
         {
              System.out.println("Not Weird");
         }
     
       scanner.close();
   }


	}


