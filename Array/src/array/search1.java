package array;

import java.util.Scanner;

public class search1 {

	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6]; 
		
//		                                                 creating a program of an array by user inputs and printing them
				System.out.println("Enter 5 inputs ");
		
				for(int i=0;i<=5;i++)
		      {
					a[i]=sc.nextInt();
			
		      }
		        for(int i=0;i<=5;i++)
	         	{
		    	   System.out.print( a[i]+"\t ");
	         	}
		        System.out.println();
		      
//		        extention of program for searching of an element in array
		        
		        	System.out.println("Enter any element that you want to search ");
		        	 int b =sc.nextInt();
		        	 int temp=0;
		        for(int i=0;i<=5;i++)
		      {
		        	
		        	    if(a[i]==b)
		        	    {
		        	    	temp=temp+1;
		        	    
		        	    }
		        	    }
		        	   if(temp>0)
		        	   {
		        	    System.out.println("Entered value is present");
		        	    }
		        	   else
		        	   {
		        		   System.out.println("Entered value is not present");  
		        	   }
		      
		        
//		        find the smallest and greatest element in array
		        int s=a[0]; 
		        for(int i=0;i<=5;i++)
			      {
		        	
			        if(s>a[i])
			        	s=a[i];
			      }
		        	 System.out.println("smallest number in the array:"+ s);
		        	 
		        	 System.out.println();
		        	 
//		        	 to update any value in an array
		        		System.out.println("Enter index that you want to update");
		        	   int e=sc.nextInt();
		        	   
		        		// for(int i=0;i<=e;i++)
				          //{
			        	    a[e]=sc.nextInt();
			        	    
			        		//System.out.println(a[i]);
				          //}
		        		 
		        		 
		        		 System.out.println("To view an updated array");
		        		 for(int i=0;i<=5;i++)
					      {
		        			 System.out.print(a[i]+  "\t");
					      }
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
			      }
		        
	        	 
	        		
	        	 
	}



	


