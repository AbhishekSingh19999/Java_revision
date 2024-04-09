package Dpackage;

import java.util.Scanner;

public class Queue1 implements Queue{
	
	int values[];
	int first;
	int remove;
	int Choice;
    Scanner  sc= new Scanner(System.in);
	
   public Queue1()
   {
	   first=-1;
	   remove=-1;
	   values=new int [ SIZE];
   }
    public void show()
	{
		System.out.println("Elements are: ");
		for(int n:values)
		{
			System.out.println(n);
		}
	}

	@Override
	public void firstInsert(int data) 
	{
		
		
			
		
		if(full())
		{
			
			System.out.println("Queue is full");
		}
		else
		{
			//
			values[++remove]=data;
			System.out.println(" element inserted ");
			first=0;
		}	
		
//		if(first==-1)
			
		}
	

	@Override
	public int lastRemove()
	{
		 int data=0;
		if(empty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
		    data=values[first];
		    values[first++]=0;
		    
		}
		return data;
	}

	@Override
	public boolean empty()
	{  
		if(first==-1&&remove==-1)
			
			return true;
	     else 
	   		return false;
	}

	@Override
	public boolean full() 
	{
		if(first==0&&remove==SIZE-1)
		 return true;
		else
		 return false;
	}
	
	public void option()
	{   
		do {
			
		System.out.println("To display the Queue:"+ "Choice1");
		System.out.println("To insert element in Queue:"+ "Choice2");
		System.out.println("To remove element from Queue:"+ "Choice3");
		System.out.println("To  check if  Queue is empty:"+ "Choice4");
		System.out.println("To check if  Queue is full :"+ "Choice5");
		System.out.println("Exit");
		Choice=sc.nextInt();
		
		
		if(Choice==1)
		{
			show();
			
		}
		else if(Choice==2)
		{
			System.out.println("Insert element");
			firstInsert(sc.nextInt());
			
		}
		else if(Choice==3)
		{
		
			int data=lastRemove();
			System.out.println("Deleted element : "+data);	
		}
		else if(Choice==4)
		{
			empty();
		}
		else if(Choice==5)
		{
			full();
		}
		}while(Choice!=6);
	}
	
	public static void main(String[] args) 
	{
	      Queue1 qu=new Queue1();
	      qu.option();
	}

}
