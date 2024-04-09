package array;

import java.util.Scanner;

public class InsertionAll_Index {

	   public static void display(int a[])
	   {
		   System.out.println("\nArray elements are :");
		   for (int x:a)
		   {
			   System.out.print(x+"\t");  
		   }
	   }
	public static void main(String[] args) {
		
      int a[] =new int [10];
      Scanner sc=new Scanner(System.in);
      int index=-1; int choice; int i;
      do {
    	  System.out.println("Choice 1"+" "+"enter element at first index"); 
    	  System.out.println("Choice 2"+" "+"enter element at middle  index"); 
    	  System.out.println("Choice 3"+" "+"enter element at last index"); 
    	  System.out.println("Choice 4"+" "+" exit"); 
    	   choice=sc.nextInt();
    	  
    	  if (index==a.length-1)
    	  {
    		  System.out.println("Array is full");
    	  }
    	  else if (choice==1)
    	  {  
    		 
    		   
    		  for( i=index+1;i>0;i--)
    		  {
    			  a[i]=a[i-1];
    		  }
    		  System.out.println("enter new element");
    		  a[0]=sc.nextInt();
    		  index++;
    		  display(a);
    	  }
    	       
    	  else if (choice==2)
    	   {            
    		    System.out.println("Enter the index on which you want to insert");
    		     int idx=sc.nextInt();
    		     
    		     for(i=index+1;i>idx;i--)
    		   {
    			   a[i]=a[i-1];
    		   }
    		     System.out.println("Enter new value");
    		     a[idx]=sc.nextInt();
    	   
    	       index++;
    	       display(a);
    	    }
    	  else if (choice==3)
    	  {
    		  System.out.println("Enter the element");
    		  a[++index]=sc.nextInt();
    		  display(a);
    	  }
      }while(choice!=4);
      
	}
}