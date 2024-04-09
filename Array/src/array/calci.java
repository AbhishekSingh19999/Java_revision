package array;

import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
	     int Choice; int c;int d;
		int temp=0;
		int a;
		

		 System.out.println("Enter first no");
		 c=sc.nextInt();
		do {
		System.out.println("choose the option ");
		
		System.out.println("Addition "+" "+ "choice 1");
		
		System.out.println("Substraction"+" "+ "choice 2");
		
		System.out.println("Division "+" "+ "choice 3");
		
		System.out.println("Multiplication "+" "+ "choice 4");
		
		System.out.println("Exit "+" "+ "choice 5");
		
		 Choice =sc.nextInt();
		
		 
			
		 if (Choice==1)
		 {
			 if(temp==0)
			 {
				 System.out.println("Enter  no1");
				 d=sc.nextInt();
				 
				 temp=c+d;
				 System.out.println("Addition is :"+ temp);
			 }
			 
			 else 
			 {
				 System.out.println("Enter  no2");
				 d=sc.nextInt();
				 temp=temp+d;
				 
				 System.out.println("Addition is :"+ temp);
			 }
			// System.out.println("Addition is :"+ temp);
			 
			 
		 }
		 else if(Choice==2)
		 {
			 if(temp==0)
			 {
				 System.out.println("Enter  no");
				 d=sc.nextInt();
				 
				 temp=c-d;
				 System.out.println("Substraction is :"+ temp);
			 }
			 
			 else 
			 {
				 System.out.println("Enter  no");
				 d=sc.nextInt();
				 temp=temp-d;
				 
				 System.out.println("Substraction is :"+ temp);
			 }
			 
			
		 }
		 else if(Choice ==3)
		 {
			 if(temp==0)
			 {
				 System.out.println("Enter  no");
				 d=sc.nextInt();
				 
				 temp=c/d;
				 System.out.println("Division is :"+ temp);
			 }
			 
			 else 
			 {
				 System.out.println("Enter  no");
				 d=sc.nextInt();
				 temp=temp/d;
				 
				 System.out.println("Division is :"+ temp);
			 }
			 
		 }
		 else if(Choice==4)
		 {
			 if(temp==0)
			 {
				 System.out.println("Enter  no");
				 d=sc.nextInt();
				 
				 temp=c*d;
				 System.out.println("Multiplication is :"+ temp);
			 }
			 
			 else 
			 {
				 System.out.println("Enter  no");
				 d=sc.nextInt();
				 temp=temp*d;
				 
				 System.out.println("Multiplication is :"+ temp);
			 }
			 
			
		 }
		}while(Choice!=5);
		
		
		
	}

}
