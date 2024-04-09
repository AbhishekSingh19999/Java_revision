package Patterns;
import java.util.Scanner;

public class Switch {

	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		
		
		System.out.println("Enter first number ");
		 int first=sc.nextInt();
		 
		 System.out.println("Enter Second number");
		 int second= sc.nextInt();
		 
		 System.out.println(" Choices are (+,-,*,/) ");
		 char choices;
		 
		 choices=sc.next().charAt(0);
		
		 
		 
	 int result;
	 
		switch(choices)
		 {
		case '+':
				 result= first +second;
				 System.out.println("result"+result);
				 break;
		 
		 
	     case '-':
		         result= first -second;
		         System.out.println("result"+result);
		         break; 
		 
	     case '*':
	 		result= first *second;
	 		 System.out.println("result"+result);
	 		 
	   break;
	   
	     case '/':
	 		result= first /second;
	 		 System.out.println("result"+result);
	 		 break;
	 		 
    }
 
			
		 
		
		
		
		
		
	
	   

	}

}
