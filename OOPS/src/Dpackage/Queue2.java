package Dpackage;

import java.util.Scanner;

public class Queue2 {
	int SIZE=8;
	int values[];
	int first;
	int remove;
	int Choice;
    Scanner  sc= new Scanner(System.in);
	
   public Queue2()
   {
	   first=-1;
	   remove=-1;
	   values=new int [ SIZE];
   }
   
   public  int firstInsert(int data) 
	{
		if(first==-1&&remove==-1)
		{
			values[++remove]=data;
			System.out.println(" element inserted ");
			first++;
		}
		else if(first==0&&remove==SIZE-1)
		{
			System.out.println("Queue is full");
		}
			
		else
		{
			values[remove++]=data;
			
		}
		return data;
		}

   
   public void  remove() 
  	{
	    int data = 0;
  		if(first==-1&&remove==-1)
  		{
  			
  		System.out.println("Queue is Empty");
  		}
  		else if(first==remove)
  		{
  			data=values[remove];
  			remove--;
  			first--;
  		}
  			
  		else
  		{
  			values[remove]=data;
  			remove++;
  		}
  	
  		}
   
   public   void show()
  	{
  		System.out.println("Elements are: ");
  		
			for(int n:values)
			{
				System.out.println(n);
			}
		
  	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int Choice;
	
	Queue2 qu=new Queue2();
		do {
			//Queue2 qu=new Queue2();
			System.out.println("To display the Queue:"+ "Choice1");
			System.out.println("To insert element in Queue:"+ "Choice2");
			System.out.println("To remove element from Queue:"+ "Choice3");
			System.out.println("Exit");
			Choice=sc.nextInt();
			
			
			if(Choice==1)
			{
				qu.show();
				
			}
			else if(Choice==2)
			{
				qu.firstInsert(int data);
			}
			else if(Choice==3)
			{
				
			}
	}while(Choice!=4);

}
