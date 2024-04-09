package ascii;

import java.util.Scanner;

public class Addthree {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("enter first subject marks");
		  int a=sc.nextInt();
		  
		  System.out.println("enter second subject marks");
		  int b=sc.nextInt();
		  
		  System.out.println("enter third subject marks");
		  int c=sc.nextInt();
		  
		  System.out.println("Average :" +((a+b+c)*100)/300);
		  
		 

	}

}
