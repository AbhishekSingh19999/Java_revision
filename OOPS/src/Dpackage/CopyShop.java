package Dpackage;

import java.util.Scanner;
public class CopyShop {
	
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
			      int as=400; int rem;
			      do {
			    	  
			    	  System.out.println();
			    	  
			    	  System.out.println("choose the option ");
			  		
			  		System.out.println( "choice 1"+"Shoes");
			  		
			  		System.out.println("choice 2"+"Shirt");
			  		
			  		System.out.println("choice 3"+"Watch");
			  		
//			  		System.out.println("choice 4"+"Shoes+Shirt+Watch");
//			  		
//			  		System.out.println("choice 5"+"Shoes+Shirt");
//			  		
//			  		System.out.println("choice 6"+"Shoes+Watch");
//			  		
//			  		System.out.println("choice 7"+"watch+Shirt");
			  		
			  		System.out.println("choice 8"+"Exit");
			  		System.out.println("enter choice values : ");
			  		
			  		 Choice =sc.nextInt();  //  123
			  		 int sum=0;
			  		 int shirt=500;
			  		 int shoes=400;
			  		 int watch=4500;
			  		 
			  		 for(int x=Choice;x>0;x/=10)
			  		 {
			  			  rem=Choice%10;
			  			 if(rem==1)
			  			 {
			  				 if(temp==0)
			  				 {
			  				 sum+=shirt;
			  				System.out.println("enter the no of pieces you want ");
			  	  		    a=sc.nextInt();
			  	  		    temp=a;
			  	  		    System.out.println("Product added to the cart");
			  			 }
			  			 else 
			  			 {
			  				  
				  				System.out.println("enter the no of pieces you want ");
				  	  		    a=sc.nextInt();
				  	  		    temp+=a;
				  	  		    
				  	  		   
				  	  		    System.out.println("Product added to the cart");
			  			 }
			  		 }
			  			 else if(rem==2)
			  			 {
			  				 sum+=shoes;
			  			 }
			  			 else if(rem==3)
			  			 {
			  				 sum+=watch;
			  			 }
			  		 }
			  		 System.out.println("sum : "+sum);
			  		 if (Choice==1)
			  		 {
			  			  if(temp==0)
			  			  {
			  				  
			  	  			System.out.println("enter the no of pieces you want ");
			  	  		    a=sc.nextInt();
			  	  		    temp+=(a*as);
			  	  		    System.out.println("Product added to the cart"+a+" - "+temp);
			  		 }
			  			  else
			  			  {
			  				  
			  				System.out.println("enter the no of pieces you want ");
			  	  		    a=sc.nextInt();
			  	  		    temp+=a;
			  	  		    
//			  	  		   
			  	  		    System.out.println("Product added to the cart"+temp);
			  			  }
			  		 }
			  		 else if (Choice==2)
			  		 {
			  			if(temp==0)
			  			  {

			  	  			System.out.println("enter the no of pieces you want ");
			  	  		    a=sc.nextInt();
			  	  		    temp=a;
			  	  		    System.out.println("Product added to the cart");
			  		 }
			  			  else
			  			  {
			  				System.out.println("enter the no of pieces you want ");
			  	  		    a=sc.nextInt();
			  	  		    temp=temp+a;
			  	  		    System.out.println("Product added to the cart");
			  			  }
			  		 }
			  		 else if(Choice==3)
			  		 {

			  			if(temp==0)
			  			  {

			  	  			System.out.println("enter the no of pieces you want ");
			  	  		    a=sc.nextInt();
			  	  		    temp=a;
			  	  		    System.out.println("Product added to the cart");
			  		 }
			  			  else
			  			  {
			  				System.out.println("enter the no of pieces you want ");
			  	  		    a=sc.nextInt();
			  	  		    temp=temp+a;
			  	  		    System.out.println("Product added to the cart");
			  			  }
			  		 }
//			  		 else if(Choice==4)
//			  		 {
//			  			if(temp==0)
//			  			  {
		//
//			  	  			System.out.println("enter the no of pieces you want ");
//			  	  		    a=sc.nextInt();
//			  	  		    temp=a;
//			  	  		    System.out.println("Product added to the cart");
//			  		 }
//			  			  else
//			  			  {
//			  				System.out.println("enter the no of pieces you want ");
//			  	  		    a=sc.nextInt();
//			  	  		    temp=temp+a;
//			  	  		    System.out.println("Product added to the cart");
//			  			  }
//			  		 }
//			  		 else if (Choice==5)
//			  		 {
//			  			if(temp==0)
//			  			  {
		//
//			  	  			System.out.println("enter the no of pieces you want ");
//			  	  		    a=sc.nextInt();
//			  	  		    temp=a;
//			  	  		    System.out.println("Product added to the cart");
//			  		 }
//			  			  else
//			  			  {
//			  				System.out.println("enter the no of pieces you want ");
//			  	  		    a=sc.nextInt();
//			  	  		    temp=temp+a;
//			  	  		   
//			  	  		    System.out.println("Product added to the cart");
//			  			  }
//			  			 
//			  		 }
//			  		 else if(Choice==6)
//			  		 {
//			  			if(temp==0)
//			  			  {
		//
//			  	  			System.out.println("enter the no of pieces you want ");
//			  	  		    a=sc.nextInt();
//			  	  		    temp=a;
//			  	  		    System.out.println("Product added to the cart");
//			  		 }
//			  			  else
//			  			  {
//			  				System.out.println("enter the no of pieces you want ");
//			  	  		    a=sc.nextInt();
//			  	  		    temp=temp+a;
//			  	  		    System.out.println("Product added to the cart");
//			  			  }
//			  		 }
//			  		 else if(Choice==7)
//			  		 {
//			  			if(temp==0)
//			  			  {
		//
//			  	  			System.out.println("enter the no of pieces you want ");
//			  	  		    a=sc.nextInt();
//			  	  		    temp=a;
//			  	  		    System.out.println("Product added to the cart");
//			  		 }
//			  			  else
//			  			  {
//			  				System.out.println("enter the no of pieces you want ");
//			  	  		    a=sc.nextInt();
//			  	  		    temp=temp+a;
//			  	  		    System.out.println("Product added to the cart");
//			  			  }
//			  			
//			  		 }
			      } while(Choice!=8);
			      System.out.println("Total no of Product added to the cart: "+temp);
			}      
			      
		


	}


