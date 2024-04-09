package array;

import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6]; int s=a[0];
		
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
		        for(int i=0;i<=5;i++)
		      {
		        	
		        	    if(a[i]==b)
		        	    {
		        		 System.out.println("Entered element is present in array at index "+ i);
		        	    }
		        	    else {
		        	 
		        	  System.out.println("Entered value is not present");
		        	    }
		      }
		        
//		        find the smallest and greatest element in array
		        
		        for(int i=0;i<=5;i++)
			      {
		        	
			        if(s>a[i])
			        {
			          s=a[i];
			        
			       // System.out.println(s);
			        
			        }
			        System.out.println(s);
		        	}
		        	
			      }
		        
	        	 
	        		
	        	 
	}



