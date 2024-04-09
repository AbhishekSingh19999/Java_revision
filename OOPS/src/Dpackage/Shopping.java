package Dpackage;

import java.util.Scanner;



public class Shopping {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	     
		System.out.println(" "+"   "+    " Welcome");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println();
		System.out.println(" "+"   "+        "  To");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println(" "+"   "+   " Apni Dukan");
	
		for (int i=0;i<=2;i++)
		{
		
		System.out.println();
		
		}
		
		System.out.println("Enter pin to login");
		
		  pinVerificaton pv=new  pinVerificaton();
	       pv.pinver();
		for (int i=0;i<=2;i++)
		{
			System.out.println(" SALE !"+" SALE !"+" SALE !");
		   
			
		    
		    
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	      System.out.println(" Exclusive offer's on various products");
	      
	      int Choice; int a; int temp=0; int amount=0;
	      int as=400; int rem; int sum=0;int s; int OTP=2525;
	      do {
	    	  
	    	  System.out.println();
	    	  
	    	  System.out.println("choose the option ");
	  		
	  		System.out.println( "choice 1"+" "+"Shirt");
	  		
	  		System.out.println("choice 2"+" "+"Shoes");
	  		
	  		System.out.println("choice 3"+" "+"Watch");
	  		
//	  		System.out.println("choice 4"+"Shoes+Shirt+Watch");
//	  		
//	  		System.out.println("choice 5"+"Shoes+Shirt");
//	  		
//	  		System.out.println("choice 6"+"Shoes+Watch");
//	  		
//	  		System.out.println("choice 7"+"watch+Shirt");
	  		
	  		System.out.println("choice 8"+"Exit");
	  		System.out.println("enter choice values : ");
	  		
	  		 Choice =sc.nextInt();  //  123
	  		
	  		 int shirt=69;
	  		 int shoes=96;
	  		 int watch=48;
	  		 
	  		 for(int x=Choice;x>0;x/=10)
	  		 {
	  			  rem=Choice%10;
	  			 if(rem==1)
	  			 {
	  				 if(temp==0)
	  				 {
	  				 
	  				System.out.println("enter the no of shirt pieces you want ");
	  	  		    a=sc.nextInt();
	  	  		    temp=a;
	  	  		sum=shirt*a;
	  	  		    System.out.println("Product added to the cart");
	  			 }
	  			 else 
	  			 {
	  				
		  				System.out.println("Enter the no of shirt pieces you want ");
		  	  		    a=sc.nextInt();
		  	  		    temp+=a;
		  	  		sum=sum+(shirt*a);
		  	  		   
		  	  		    System.out.println("Product added to the cart");
	  			 }
	  		 }
	  			 else if(rem==2)
	  			 {
	  				 
	  				 if(temp==0)
	  				 {
	  				 
	  				System.out.println("enter the no of shoes pieces you want ");
	  	  		    a=sc.nextInt();
	  	  		    temp=a;
	  	  		sum=shoes*a;
	  	  		    System.out.println("Product added to the cart");
	  			 }
	  				 else 
		  			 {
		  				  
			  				System.out.println("Enter the no of shoes pieces you want ");
			  	  		    a=sc.nextInt();
			  	  		    temp+=a;
			  	  		sum=sum+(shoes*a);
			  	  		   
			  	  		    System.out.println("Product added to the cart");
	  			 }
	  			 }
	  			 else if(rem==3)
	  			 {
	  				
	  				 if(temp==0)
	  				 {
	  				
	  				System.out.println("enter the no of watch pieces you want ");
	  	  		    a=sc.nextInt();
	  	  		    temp=a;
	  	  		 sum=watch*a;
	  	  		    System.out.println("Product added to the cart");
	  			 }
	  				 else 
		  			 {
		  				  
			  				System.out.println("Enter the no of watch pieces you want ");
			  	  		    a=sc.nextInt();
			  	  		    temp+=a;
			  	  		 sum=sum+(watch*a);
			  	  		   
			  	  		    System.out.println("Product added to the cart");
	  			 }
	  		 }
	  		 
//	  		
////	  		 else if(Choice==4)
////	  		 {
////	  			if(temp==0)
////	  			  {
////
////	  	  			System.out.println("enter the no of pieces you want ");
////	  	  		    a=sc.nextInt();
////	  	  		    temp=a;
////	  	  		    System.out.println("Product added to the cart");
////	  		 }
////	  			  else
////	  			  {
////	  				System.out.println("enter the no of pieces you want ");
////	  	  		    a=sc.nextInt();
////	  	  		    temp=temp+a;
////	  	  		    System.out.println("Product added to the cart");
////	  			  }
////	  		 }
////	  		 else if (Choice==5)
////	  		 {
////	  			if(temp==0)
////	  			  {
////
////	  	  			System.out.println("enter the no of pieces you want ");
////	  	  		    a=sc.nextInt();
////	  	  		    temp=a;
////	  	  		    System.out.println("Product added to the cart");
////	  		 }
////	  			  else
////	  			  {
////	  				System.out.println("enter the no of pieces you want ");
////	  	  		    a=sc.nextInt();
////	  	  		    temp=temp+a;
////	  	  		   
////	  	  		    System.out.println("Product added to the cart");
////	  			  }
////	  			 
////	  		 }
////	  		 else if(Choice==6)
////	  		 {
////	  			if(temp==0)
////	  			  {
////
////	  	  			System.out.println("enter the no of pieces you want ");
////	  	  		    a=sc.nextInt();
////	  	  		    temp=a;
////	  	  		    System.out.println("Product added to the cart");
////	  		 }
////	  			  else
////	  			  {
////	  				System.out.println("enter the no of pieces you want ");
////	  	  		    a=sc.nextInt();
////	  	  		    temp=temp+a;
////	  	  		    System.out.println("Product added to the cart");
////	  			  }
////	  		 }
////	  		 else if(Choice==7)
////	  		 {
////	  			if(temp==0)
////	  			  {
////
////	  	  			System.out.println("enter the no of pieces you want ");
////	  	  		    a=sc.nextInt();
////	  	  		    temp=a;
////	  	  		    System.out.println("Product added to the cart");
////	  		 }
////	  			  else
////	  			  {
////	  				System.out.println("enter the no of pieces you want ");
////	  	  		    a=sc.nextInt();
////	  	  		    temp=temp+a;
////	  	  		    System.out.println("Product added to the cart");
////	  			  }
////	  			
////	  		 }
	  		 }
	  		 } while(Choice!=8);
	      System.out.println("Total no of Product added to the cart: "+temp);
	      System.out.println("sum : "+sum);
	      
	      System.out.println();
	      System.out.println();
	      System.out.println();
	      {  
	      System.out.println("Enter the card details");
	      
	       s=sc.nextInt();
	       
	       System.out.println("Card no is: "+s);
	      }
//	       Matching pin
//	         with an 
//	         existing pin
	      
	      System.out.println("Enter pin to login");
	     
	       temp=0; int upin= 1111; 
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
 	        	//System.out.println("OTP is sended on your mobile no");
 	        	
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
          System.out.println("Enter your mobile no for OTP");
          s=sc.nextInt();
          System.out.println();
          System.out.println();
          
          try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          System.out.println("OTP is sended on your mobile no");
          System.out.println();
          System.out.println();
          
        
          
          for( temp=0;temp<3;)
          {  
        	  System.out.println("Enter OTP");
              int otp=sc.nextInt();
       			
 	        	
 	    	   temp++;
  	
  	        if(OTP==otp)
  	        {
  	        	System.out.println("OTP is correct");
  	        	System.out.println();
  	        	System.out.println();
  	        	
  	        	try {
					Thread.sleep(2500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
  	        	System.out.println("Transaction Completed");
  	        	
  	        	break;
  	        }
          

  	        else
  	       {
  	        	try 
 		    	{
 		    		throw new ArithmeticException("OTP is incorrect");
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
	}      
	      
}


