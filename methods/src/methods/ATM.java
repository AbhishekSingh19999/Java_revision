package methods;

import java.util.Scanner;

public class ATM {
	
	static int a;
	public static void  welcome()
	{
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Here it's an ATM Program ");
		
		System.out.println();
		System.out.println("  Welcome");
		System.out.println("     To");
		System.out.println("Aam Admi Bank ");
		
		System.out.println("Please insert your card");
		
		
	}

	public static void main(String[] args) {
		
		
		  ATM at=new ATM();
		      at.welcome();
		// System.out.println(at.welcome());
		 
		 //		first step for pin verification 3
		
		      pinVerificaton pv=new  pinVerificaton();
		       pv.pinver();
		       
		       Balance bal=new Balance();
		       bal.bal();
		
		
		
	}

}
