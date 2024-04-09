package Dpackage;

import java.util.Scanner;

public class pinVerificaton {
	

	public  int pinver() {
		
	
	{
		Scanner sc=new Scanner(System.in);
		
		  int temp=0; int upin= 3333; 
            for( temp=0;temp<3;)
           {  
        		System.out.println("Enter your pin ");
        		int pin=sc.nextInt();
        			
 	        	
  	    	   temp++;
   	
   	        if(upin==pin)
   	        {
   	        	System.out.println("Pin is correct");
   	        	System.out.println();
   	        	System.out.println();
   	        	System.out.println("Welcome");
   	        	
   	        	break;
   	        }
           
  
   	        else
   	       {
   	        	try 
		    	{
		    		throw new ArithmeticException("Pin is incorrect");
		    	}
		    	catch(ArithmeticException ae)
		    	{
		    		System.out.println("Error: "+ae.getMessage());
		    	}
   		     // System.out.println("Pin is incorrect");  
   		      
   		      if(temp==3)
   		      {
   		    	  System.out.println("You have exceded your attempt");
   		      }
   	       }   
  
		     
	}
            return 0;
	}
}
}